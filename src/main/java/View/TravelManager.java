/**
 * Created by adam on 2016-05-01.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SlideEndEvent;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class TravelManager implements Serializable {

    private int fromValue = 0;
    private int toValue = 5000;
    private int travellers = 1;

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

    public int getTravellers() {
        return travellers;
    }

    public void setTravellers(int travellers) {
        this.travellers = travellers;
    }

    public void submit () {

    }
}
