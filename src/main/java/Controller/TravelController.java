package Controller;

import Model.Trip;
import Model.TripFinder;

/**
 * Created by adam on 2016-05-02.
 */
public class TravelController {
    public Trip findMatch(int fromValue, int toValue, int nrOfTickets) {
        TripFinder finder = new TripFinder(fromValue, toValue, nrOfTickets);
        Trip trip = finder.findTrip();
        return trip;
    }
}
