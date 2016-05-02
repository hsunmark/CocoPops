package Model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Henrik on 2016-05-03.
 */
public class HttpConnector {
    private Request request;
    private Gson gson;

    public HttpConnector(Request request) {
        this.request = request;
        gson = new Gson();
    }

    public String sendRequest()throws IOException {
        JsonObject requestObj = new JsonObject();
        JsonElement jsonElement = gson.toJsonTree(request);
        requestObj.add("request", jsonElement);
        String postUrl = "https://www.googleapis.com/qpxExpress/v1/trips/search?key=" + readApiKey();

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(postUrl);
        StringEntity postString = new StringEntity(requestObj.toString());
        post.setEntity(postString);
        post.setHeader("Content-type", "application/json");

        //response
        HttpResponse response = httpClient.execute(post);
        HttpEntity httpEntity = response.getEntity();
        String content = EntityUtils.toString(httpEntity);
        return content;
    }

    private String readApiKey() {
        String line;
        try {
            BufferedReader file = new BufferedReader(new FileReader("src/apikey.txt"));
            while ((line = file.readLine()) != null) {
                return line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
