package Model;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by karl-antonbrotmark on 2016-05-02.
 */
public class MainTest {

    public static void main(String[] args) throws ParseException, UnsupportedEncodingException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fromDate = sdf.parse("2016-06-25");
        Date toDate = sdf.parse("2016-06-25");

        Request request = new Request("ARN", "MIA", fromDate, toDate, 1, 0, 20000);
        HttpConnector httpConnector = new HttpConnector(request);
        System.out.println(httpConnector.sendRequest());
    }

}
