package Model;

import java.util.Date;

/**
 * Created by adam on 2016-05-02.
 */
public class TripFinder {

    private int fromValue;
    private int toValue;
    private int nrOfTickets;
    private Date fromDate;
    private Date toDate;

    public TripFinder (int fromValue, int toValue, int nrOfTickets,
                       Date fromDate, Date toDate) {
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.nrOfTickets = nrOfTickets;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Trip findTrip () {
        //Find the trip
        return null;
    }
}
