package burstcoin.com.burst;

/**
 * Created by Aiyaz Parmar on 7/4/16.
 */
public class DataModel {
    private String id;
    private String name;
    private String phrase;
    private String pin;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
