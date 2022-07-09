package tech.kbtg.vehicle;

// Inheritance :: extends
public class Ship extends Vehicle implements Floatable {
    String move() {
        return "Float";
    }

    @Override
    public String veeee() {
        return "Veeeeeeeeeeeeeeeeeee";
    }
}
