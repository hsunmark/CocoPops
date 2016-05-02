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
    final String fileName = "src/airports.txt";
    List<String> cities = new ArrayList<String>();

    List<String> destinationInfo = new ArrayList<String>();

    public List<String> randomCity() {

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


        String unformattedResult = cities.get(randIndex);

        String[] dest = unformattedResult.split(", ");
        String[] countryAndAirport = dest[1].split(" \\(");

        destinationInfo.add(0,dest[0]);
        destinationInfo.add(1, countryAndAirport[0]);
        destinationInfo.add(2,countryAndAirport[1].substring(0,3));

        // return CITY, COUNTRY, AIRPORT-CODE
        return destinationInfo;

    }

}

/**
 * Låter regex ligga kvar för det vara så jävla jobbigt

 for (int i = 0; i < cities.size(); i++) {
 //Pattern pattern = Pattern.compile();
 //Matcher m = pattern.matcher(cities.get(i));

 if(cities.get(i).matches("\\w+, \\w+, .*?")) {
 System.out.println(cities.get(i));
 }


 }
 */