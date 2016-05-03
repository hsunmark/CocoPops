package Model;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by adam on 2016-05-02.
 */
public class TripFinder {
    final int CITY = 0;
    final int COUNTRY = 1;
    final int AIRPORT = 2;

    private String fromAirport;
    private int fromValue;
    private int toValue;
    private int nrOfTickets;
    private Date fromDate;
    private Date toDate;

    public TripFinder (String fromAirport, int fromValue, int toValue, int nrOfTickets,
                       Date fromDate, Date toDate) {
        this.fromAirport = fromAirport;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.nrOfTickets = nrOfTickets;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Trip findTrip () throws IOException {
        Cities cities = new Cities();
        List<String> randomCity = cities.randomCity();
        Request request = new Request(fromAirport, randomCity.get(AIRPORT), fromDate, toDate, nrOfTickets, fromValue, toValue);
        HttpConnector httpConnector = new HttpConnector(request);
        System.out.println(httpConnector.sendRequest());
        return null;
    }
}
