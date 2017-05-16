package seungchan.com.tobaccoach_5_2.model;

import java.io.Serializable;

/**
 * Domain Model
 * Tobacco
 */

public class Tobacco implements Serializable {

    // Fields
    private String tobaccoBrand;
    private String tobaccoName;
    private double tobaccoTar;
    private double tobaccoNicotine;
    private int tobaccoPrice;

    // Constructors
    public Tobacco(){}

    public Tobacco(String tobaccoBrand, String tobaccoName, double tobaccoTar, double tobaccoNicotine, int tobaccoPrice) {
        this.tobaccoBrand = tobaccoBrand;
        this.tobaccoName = tobaccoName;
        this.tobaccoTar = tobaccoTar;
        this.tobaccoNicotine = tobaccoNicotine;
        this.tobaccoPrice = tobaccoPrice;
    }

    public String getTobaccoBrand() {
        return tobaccoBrand;
    }

    public void setTobaccoBrand(String tobaccoBrand) {
        this.tobaccoBrand = tobaccoBrand;
    }

    public String getTobaccoName() {
        return tobaccoName;
    }

    public void setTobaccoName(String tobaccoName) {
        this.tobaccoName = tobaccoName;
    }

    public double getTobaccoTar() {
        return tobaccoTar;
    }

    public void setTobaccoTar(double tobaccoTar) {
        this.tobaccoTar = tobaccoTar;
    }

    public double getTobaccoNicotine() {
        return tobaccoNicotine;
    }

    public void setTobaccoNicotine(double tobaccoNicotine) {
        this.tobaccoNicotine = tobaccoNicotine;
    }

    public int getTobaccoPrice() {
        return tobaccoPrice;
    }

    public void setTobaccoPrice(int tobaccoPrice) {
        this.tobaccoPrice = tobaccoPrice;
    }
}
