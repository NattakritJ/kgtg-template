package tech.kbtg.vehicle;

public class Main {
    public static void main(String[] args) {
        Car civic = new Car();
        civic.setEngine("combustion engine");
        civic.setController("steering wheel");
        register(civic);
        System.out.println(civic.move());

        AirPlane aribus370 = new AirPlane();
        aribus370.setEngine("turbine engine");
        aribus370.setController("joystick");
        register(aribus370);
        System.out.println(aribus370.move());
        aribus370.setBlackBox("Log 1");
        System.out.println(aribus370.getBlackBox());
        System.out.println(aribus370.getBlackBox("555"));

        Ship ship = new Ship();
        ship.setEngine("combustion engine");
        ship.setController("helm");
        ship.setName("ลอยยยยยยยยยยย");
        register(ship);
    }

    public static void register(Vehicle c) {
        System.out.println(c.getClass() + " register as " + c.getName());
    }
}
