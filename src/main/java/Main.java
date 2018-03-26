import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Saeniel on 26.03.2018.
 */
public class Main {

    private static String URL = "https://ab.ua/avto/?page=1&per-page=20";

    public static void main(String[] args) {

        try {
            Document doc  = Jsoup.connect(URL).get();
            //Elements elements = doc.getElementsByClass("_2KGO4");

            Elements elements = doc.select("._2KGO4").select("._1i-so");
            for (Element element: elements) {
                System.out.println(element.className());
                Elements secondLevelSiblings = element.siblingElements();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
