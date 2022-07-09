package tech.kbtg.vehicle;

// Abstraction
public abstract class Vehicle {

    private String name;
    private String engine;
    private String controller;

    abstract String move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }
}
