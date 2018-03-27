import com.sun.deploy.util.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Saeniel on 26.03.2018.
 */
public class Main {

    private static String URL = "https://ab.ua/avto/?page=1&per-page=20";
    private static ArrayList<String> linksToAds = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        getLinks();
        for (String linkToAd: linksToAds) {
            Document adPage  = Jsoup.connect(linkToAd).get();
            Elements elements = adPage.select(".O5qCD"); // берем блок с информацией о названии машины
            String name = elements.text(); // получаем название модели и марки
            System.out.println(name);

            String imageLink = adPage.select("._3-faW").attr("style"); // получаем строку
            String regex = "[\\p{Ps}\\p{Pe}]";                                             // с ссылкой на изображение
            imageLink = imageLink.replaceAll(regex, "");
            imageLink = imageLink.replace("background-image:url", "");
            System.out.println(imageLink);

            elements = adPage.select("._2wKv2");
            String tempCost = elements.text();
            String cost = tempCost.substring(0, tempCost.indexOf("н")).concat("н");
            System.out.println(cost);
            System.out.println("");
        }

    }

    public static void getLinks() {
        try {
            Document doc  = Jsoup.connect(URL).get();
            Elements elements = doc.select("._2KGO4"); // берем блок со всеми объявлениями
            Elements rawLinks = elements.select("a[href]"); // парсим ссылки
            for (Element element: rawLinks) {
                if(!linksToAds.contains(element.attr("abs:href"))) {
                    linksToAds.add(element.attr("abs:href"));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}


