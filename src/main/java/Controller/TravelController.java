package Controller;

import Model.Cities;
import Model.Trip;
import Model.TripFinder;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by adam on 2016-05-02.
 */
public class TravelController {

    public Trip findMatch(String fromAirport, int fromValue, int toValue, int nrOfTickets,
                          Date fromDate, Date toDate) throws IOException {

        TripFinder finder = new TripFinder(fromAirport, fromValue, toValue, nrOfTickets, fromDate, toDate);
        finder.findTrip();

        Trip trip = finder.findTrip();
        return trip;
    }
}
