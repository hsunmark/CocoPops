package View; /**
 * Created by adam on 2016-05-01.
 */

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Controller.TravelController;
import Model.Trip;
import org.primefaces.context.RequestContext;

import java.io.IOException;
import java.util.Date;

@ManagedBean
@SessionScoped
public class TravelManager {

    private int fromValue = 0;
    private int toValue = 5000;
    private int nrOfTickets = 1;
    private TravelController controller = new TravelController();
    private Date fromDate;
    private Date toDate;
    private String fromAirport;

    public int getFromValue() {
        return fromValue;
    }

    public void setFromValue(int fromValue) {
        this.fromValue = fromValue;
    }

    public int getToValue() {
        return toValue;
    }

    public void setToValue(int toValue) {
        this.toValue = toValue;
    }

    public int getNrOfTickets() {
        return nrOfTickets;
    }

    public void setNrOfTickets(int nrOfTickets) {
        this.nrOfTickets = nrOfTickets;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void submit () throws IOException {
        Trip trip;
        try {
            trip = controller.findMatch(fromAirport, fromValue, toValue, nrOfTickets, fromDate, toDate);
        } catch (NullPointerException e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sorry!", "No trip found.");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
        }
        //Show the trip

}

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }
}
