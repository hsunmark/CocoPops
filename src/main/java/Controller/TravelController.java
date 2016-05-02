package Controller;

import Model.Trip;
import Model.TripFinder;

import java.util.Date;

/**
 * Created by adam on 2016-05-02.
 */
public class TravelController {
    public Trip findMatch(int fromValue, int toValue, int nrOfTickets, Date fromDate, Date toDate) {
        TripFinder finder = new TripFinder(fromValue, toValue, nrOfTickets, fromDate, toDate);
        Trip trip = finder.findTrip();
        return trip;
    }
}
