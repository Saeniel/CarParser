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

    public static void main(String[] args) {

        try {
            Document doc  = Jsoup.connect(URL).get();
            Elements elements = doc.select("._2KGO4");
            Elements rawLinks = elements.select("a[href]");
            for (Element element: rawLinks) {
                if(!linksToAds.contains(element.attr("abs:href"))) {
                    linksToAds.add(element.attr("abs:href"));
                    System.out.println(element.attr("abs:href"));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
