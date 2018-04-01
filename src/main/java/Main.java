import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Saeniel on 26.03.2018.
 */
public class Main {

    private static ArrayList<CarAB > listAb = new ArrayList<>();

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
                          postId;         // id поста

    private static URL nextAbPage;
    private static int pageIndex = 2;


    public static void main(String[] args) throws Exception {

        nextAbPage = new URL("https://ab.ua/api/_posts/?page=1&transport=1");

        parseAB();

        System.out.println("end");

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

                    postId = carAd.getString("id");
                    phone = throwPhoneRequest(postId);

                    datePublicated = carAd.getString("date_publicated");

                    // создаём экземпляр класса
                    CarAB carAB = new CarAB(brand, model, image, price, color,
                            capacity, mileage, bodyType, fuel, gearBox, city, phone, datePublicated, postId);

                    // и добавляем в массив объектов. это можно убрать и "на лету" записывать в БД.
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
        pageIndex++;
        try {
            JSONArray params = obj.getJSONArray("results"); // вытягиваем из ответа массив объявлений
            return params;
        } catch (JSONException e) {
            return null;
        }

    }

    public static String throwPhoneRequest(String id) throws IOException {

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
}


