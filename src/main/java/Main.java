import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class Main {

    private static ArrayList<CarAB> listAb = new ArrayList<>();
    private static ArrayList<String> linksToAds = new ArrayList<>();

    private static String brand,          // марка
                          model,          // модель
                          image,          // ссылка на изображение
                          price,          // цена в грн
                          color,          // цвет
                          capacity,       // объем двигателя
                          mileage,        // пробег (тыс. км)
                          bodyType,       // тип кузова
                          fuel,           // тип топлива
                          gearBox,        // тип коробки
                          city,           // город
                          phone,          // номер телефон
                          datePublicated, // дата публикации объявления
                          postIdOLX,      // номер объявления OLX
                          postIdAB;       // id поста на ab.ua уникальное поле, как я понял, по нему можно проверять
                                          // существует ли объяление в БД

    private static URL nextAbPage;
    private static int pageIndex = 2;


    public static void main(String[] args) throws Exception {

        nextAbPage = new URL("https://ab.ua/api/_posts/?page=1&transport=1");

       // parseAB();

        System.out.println("end of ab.ua");

        parseOLX();

        System.out.println("end of olx.ua");

    }

    public static void parseAB() throws Exception {

       // пока не дойдем до 500 страницы
       while(!nextAbPage.toString().equals("https://ab.ua/api/_posts/?page=501&transport=1")) {
            JSONArray jsonArray = throwRequestToAB(nextAbPage); // получаем массив объявлений

            if(jsonArray != null) {

                for (int i = 0; i < jsonArray.length(); i++) { // и проходим по нему циклом

                    JSONArray arr;
                    JSONObject obj, objTemp;

                    JSONObject carAd = jsonArray.getJSONObject(i);

                    obj = carAd.getJSONObject("make");
                    brand = obj.getString("title");

                    obj = carAd.getJSONObject("model");
                    model = obj.getString("title");

                    arr = carAd.getJSONArray("photos");
                    try {
                        obj = arr.getJSONObject(0);
                        image = obj.getString("image");
                    } catch (Exception e) {
                        image = "";
                    }

                    arr = carAd.getJSONArray("price");
                    for (int j = 0; j < arr.length(); j++) {
                        obj = arr.getJSONObject(j);
                        if (obj.getString("currency").equals("uah")) {
                            price = obj.getString("value");
                        }
                    }

                    obj = carAd.getJSONObject("color");
                    color = obj.getString("title");
                    if (color.equals("null")) {
                        color = "";
                    }

                    capacity = carAd.getString("capacity");
                    if (capacity.equals("null")) {
                        capacity = "";
                    }

                    mileage = carAd.getString("mileage");

                    obj = carAd.getJSONObject("characteristics");
                    try {
                        objTemp = obj.getJSONObject("category");
                        bodyType = objTemp.getString("title");
                    } catch (Exception e) {
                        bodyType = "";
                    }

                    obj = carAd.getJSONObject("characteristics");
                    try {
                        objTemp = obj.getJSONObject("engine");
                        fuel = objTemp.getString("title");
                    } catch (Exception e) {
                        fuel = "";
                    }

                    obj = carAd.getJSONObject("characteristics");
                    try {
                        objTemp = obj.getJSONObject("gearbox");
                        gearBox = objTemp.getString("title");
                    } catch (Exception e) {
                        gearBox = "";
                    }

                    obj = carAd.getJSONObject("location");
                    city = obj.getString("title");

                    postIdAB = carAd.getString("id");
                    phone = throwPhoneRequestAB(postIdAB);

                    datePublicated = carAd.getString("date_publicated");

                    // создаём экземпляр класса
                    CarAB carAB = new CarAB(brand, model, image, price, color,
                            capacity, mileage, bodyType, fuel, gearBox, city, phone, datePublicated, postIdAB);

                    // и добавляем в массив объектов. нужно убрать и "на лету" записывать в БД,
                    // т.к. страдает производительность (9980 объявлений на ab.ua по легковым авто).
                    listAb.add(carAB);

                }
            } else {
                System.out.println("Last page " + pageIndex);  // для отладки
                break;
            }
        }
    }

    public static JSONArray throwRequestToAB(URL url) throws Exception {

        // формируем запрос
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Postman-Token", "864b5e8b-a547-461e-b5bd-99470c9f6d4c")
                .build();
        Response response = client.newCall(request).execute();

        JSONObject obj = new JSONObject(response.body().string()); // получаем ответ
        System.out.println(pageIndex);
        // берём сразу ссылку на следующую страницу
        nextAbPage = new URL("https://ab.ua/api/_posts/?" + "page="+ pageIndex + "&transport=1");
        pageIndex++;  // инкрементируем индекс страницы
        try {
            JSONArray params = obj.getJSONArray("results"); // получаем из ответа массив объявлений
            return params;
        } catch (JSONException e) {
            return null;
        }

    }

    public static String throwPhoneRequestAB(String id) throws IOException {

       String phone;

       // формируем запрос для получения номера телефона
       OkHttpClient client = new OkHttpClient();
       Request request = new Request.Builder()
               .url("https://ab.ua/api/_posts/9396051/phones/")
               .get()
               .addHeader("Cache-Control", "no-cache")
               .addHeader("Postman-Token", "a135a41c-0864-47cf-99e5-a4f204f8113f")
               .build();
       Response response = client.newCall(request).execute(); // и шлём его

       phone = response.body().string();
       return phone;
   }

    public static void parseOLX() throws Exception {

        for (int i = 0; i < 500; i++) {

            Response response = throwRequestToOLX(i+1);    // получаем i-ю страницу
            Document doc = Jsoup.parse(response.body().string());    // парсим ответ в HTML
            Elements elements = doc.select("tbody");        // берём элементы tbody
            Elements rawLinks = elements.select("a[href]");          // а у них - ссылки
            for (Element element: rawLinks) {                                    // для каждой ссылки выясняем
                String tempStr = element.attr("abs:href");
                if(tempStr.contains("obyavlenie")) {      // если ссылка содержит в себе слово "объявление"
                    if(tempStr.contains(";promoted")) {   // дабы избежать повтором избавляемся от ;promoted
                        String link = tempStr.replace(";promoted", "");
                        if (!linksToAds.contains(link)) {
                            linksToAds.add(link);
                            parseOlxAd(link);
                        }
                    } else if(!tempStr.equals("")) {     // избавляемся от пустых ссылок (такое бывает)
                        if (!linksToAds.contains(tempStr)) {
                            linksToAds.add(element.attr("abs:href"));
                            parseOlxAd(element.attr("abs:href"));
                        }
                    }
                }
            }
            String sdf = "sdf";
        }
        String sdf2 = "sdf";
    }

    public static Response throwRequestToOLX(int pageIndex) throws Exception {

        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
        RequestBody body = RequestBody.create(mediaType, "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"page\"\r\n\r\n"
                + pageIndex +
                "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"search[category_id]\"\r\n\r\n108\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--");
        Request request = new Request.Builder()
                .url("https://www.olx.ua/ajax/search/list/")
                .post(body)
                .addHeader("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Postman-Token", "e80210aa-1766-41e1-b6a4-730581e1720b")
                .build();

        Response response = client.newCall(request).execute();
        return  response;
    }

    public static void parseOlxAd(String url) throws Exception {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
        RequestBody body = RequestBody.create(mediaType, "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"page\"\r\n\r\n2\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"search[category_id]\"\r\n\r\n108\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--");
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Postman-Token", "caf6c1fb-8e5e-4a29-84f3-b407c3b0d1c8")
                .build();
        Response response = client.newCall(request).execute();

        Document doc = Jsoup.parse(response.body().string());
        Elements elements = doc.select("div.offer-titlebox__details");
        elements = elements.select("em").select("small");
        String id = elements.text();
        postIdOLX = id.substring(17);

        price = doc.select("div.price-label").select("strong").text();

        Elements table = doc.select("table.details");
        Elements el = table.select("th:contains(Марка)");
        Element val = el.parents().select("td.value").first();
        try {
            brand = val.text();
        } catch (Exception e) {
            brand = "";
        }

        try {
            el = table.select("th:contains(Модель)");
            val = el.parents().select("td.value").first();
            model = val.text();
        } catch (Exception e) {
            model = "";
        }

        try {
            el = table.select("th:contains(Цвет)");
            val = el.parents().select("td.value").first();
            color = val.text();
        } catch (Exception e) {
            color = "";
        }

        try {
            el = table.select("th:contains(Объем двигателя)");
            val = el.parents().select("td.value").first();
            capacity = val.text();
        } catch (Exception e) {
            capacity = "";
        }

        try {
            el = table.select("th:contains(Пробег)");
            val = el.parents().select("td.value").first();
            mileage = val.text();
        } catch (Exception e) {
            mileage = "";
        }

        try {
            el = table.select("th:contains(Тип кузова)");
            val = el.parents().select("td.value").first();
            bodyType = val.text();
        } catch (Exception e) {
            bodyType = "";
        }

        try {
            el = table.select("th:contains(Вид топлива)");
            val = el.parents().select("td.value").first();
            fuel = val.text();
        } catch (Exception e) {
            fuel = "";
        }

        try {
            el = table.select("th:contains(Коробка передач)");
            val = el.parents().select("td.value").first();
            gearBox = val.text();
        } catch (Exception e) {
            gearBox = "";
        }

        city = doc.select("a.show-map-link").select("strong").text();
        city = city.substring( 0, city.indexOf(","));

        elements = doc.select("div.offer-titlebox__details").select("em");
        datePublicated = elements.text();
        String[] parts = datePublicated.split(",");
        datePublicated = parts[1];

        val = doc.select("div#photo-gallery-opener").select("img").first();
        image = val.absUrl("src");
        String qwe = "f";
    }

}


