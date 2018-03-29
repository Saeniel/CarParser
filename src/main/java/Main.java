import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

/**
 * Created by Saeniel on 26.03.2018.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        JSONArray Jarray = throwRequest();


    }

    public static JSONArray throwRequest() throws Exception {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://ab.ua/api/_posts/?transport=1")
                .get()
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Postman-Token", "864b5e8b-a547-461e-b5bd-99470c9f6d4c")
                .build();
        Response response = client.newCall(request).execute();

        String jsonData = response.body().string();
        JSONObject Jobject = new JSONObject(jsonData);
        JSONArray Jarray = Jobject.getJSONArray("cars");
        return Jarray;
    }

    public static String readJSON() throws IOException {
        String json = null;
        BufferedReader br = new BufferedReader(new FileReader("Output.json"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return json;
    }
}


