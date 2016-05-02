package Model;

import java.util.Date;
import java.util.List;

/**
 * Created by Henrik on 2016-05-02.
 */
public class Request {

    private class Slice {
        private String origin;
        private String destination;
        private Date date;

        private Slice(String origin, String destination, Date date) {
            this.origin = origin;
            this.destination = destination;
            this.date = date;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }
    }

    private class passengers {
        private String adultCount;
        private String childCount;

        public String getAdultCount() {
            return adultCount;
        }

        public void setAdultCount(String adultCount) {
            this.adultCount = adultCount;
        }
    }

    private List<Slice> slice;
    private int solutions;
    private int maxPrice;

    public List<Slice> getSlice() {
        return slice;
    }

    public void setSlice(List<Slice> slice) {
        this.slice = slice;
    }
}
