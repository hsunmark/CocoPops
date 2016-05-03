package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Henrik on 2016-05-02.
 */
public class Request {

    public Request(String origin, String destination, Date fromDate, Date toDate, int nrOfTickets,
                    int minPrice, int maxPrice) {
        slice = new ArrayList<Slice>();
        slice.add(new Slice(origin, destination, fromDate)); //Out trip
        slice.add(new Slice(destination, origin, toDate)); //Home trip
        passengers = new Passengers(nrOfTickets);
        this.maxPrice = "USD" + Integer.toString(maxPrice);
        this.solutions = 1;

    }

    private class Slice {
        private String origin;
        private String destination;
        private String date;

        private Slice(String origin, String destination, Date date) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            this.origin = origin;
            this.destination = destination;
            this.date = sdf.format(date);
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    private class Passengers {
        private int adultCount;

        private Passengers(int nrOfTickets) {
            this.adultCount = nrOfTickets;
        }

        public int getAdultCount() {
            return adultCount;
        }

        public void setAdultCount(int adultCount) {
            this.adultCount = adultCount;
        }
    }

    private Passengers passengers;
    private List<Slice> slice;
    private int solutions;
    private String maxPrice;

    public List<Slice> getSlice() {
        return slice;
    }

    public void setSlice(List<Slice> slice) {
        this.slice = slice;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public int getSolutions() {
        return solutions;
    }

    public void setSolutions(int solutions) {
        this.solutions = solutions;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int String) {
        this.maxPrice = maxPrice;
    }
}
