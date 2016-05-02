/**
 * Created by adam on 2016-05-01.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SlideEndEvent;

import java.io.Serializable;

@ManagedBean (name = "front", eager = true)
@SessionScoped
public class View implements Serializable {

    private int fromValue = 0;
    private int toValue = 5000;
    private int nrOfTickets = 1;

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

    public void submit () {

    }
}
