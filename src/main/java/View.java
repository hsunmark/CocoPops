/**
 * Created by adam on 2016-05-01.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean (name = "front", eager = true)
@SessionScoped
public class View implements Serializable {

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
