package tech.kbtg.vehicle;

public class OverseaTransport {

    // Overloading method
    String go(Flyable f) {
        return f.fly();
    }

    // Overloading method
    String go(Floatable f) {
        return f.veeee();
    }
}
