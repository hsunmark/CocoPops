package Model;

import java.util.Date;

/**
 * Created by adam on 2016-05-02.
 */
public class Trip {

    private String country;
    private String city;
    private String airport;
    private int passengers;
    private double price;
    private Date fromDate;
    private Date toDate;

    public Trip (String country, String city, String airport, int passengers,
                 double price, Date fromDate, Date toDate) {
        this.country = country;
        this.city = city;
        this.airport = airport;
        this.passengers = passengers;
        this.price = price;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }
}
