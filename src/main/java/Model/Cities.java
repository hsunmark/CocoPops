package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by karl-antonbrotmark on 2016-05-02.
 */
public class Cities {

    final String fileName = "src/cities.txt";
    ArrayList<String> cities = new ArrayList<String>();

    public String randomCity() {

        String currentLine;
        int randIndex = 0;

        try {

            BufferedReader file = new BufferedReader(new FileReader(fileName));

            while ((currentLine = file.readLine()) != null) {
                cities.add(currentLine);
            }

            // get random index number, to be able to get random city from arraylist
            randIndex = (int)(Math.floor(Math.random()*cities.size()));

        }catch (Exception e) {
            e.printStackTrace();
        }

        return cities.get(randIndex);
    }

}
