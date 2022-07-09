package tech.kbtg.vehicle;

// Inheritance :: extends
public class AirPlane extends Vehicle implements Flyable {

    // Encapsulation
    private String blackBox;

    // Method Overriding
    String move() {
        return "Im Fly????";
    }

    public void setBlackBox(String blackBox) {
        this.blackBox += blackBox;
    }

    // Overloading method
    public String getBlackBox() {
        return "$&$%&^%$&^";
    }

    // Overloading method
    public String getBlackBox(String secretKey) {
        if (secretKey == "555")
            return this.blackBox;
        return getBlackBox();
    }

    @Override
    public String fly() {
        return "I'am Flyyyyyyyyyyyyyyyyyy";
    }
}
