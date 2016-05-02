package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by karl-antonbrotmark on 2016-05-02.
 */
public class Cities {

    private final String FILENAME = "src/cities.txt";
    private List<String> cities = new ArrayList<String>();

    public String randomCity() {

        String currentLine;
        int randIndex = 0;

        try {
            BufferedReader file = new BufferedReader(new FileReader(FILENAME));

            while ((currentLine = file.readLine()) != null) {
                cities.add(currentLine);
            }

            // get random index number, to be able to get random city from arraylist
            randIndex = (int)(Math.floor(Math.random()*cities.size()));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cities.get(randIndex);
    }
}
