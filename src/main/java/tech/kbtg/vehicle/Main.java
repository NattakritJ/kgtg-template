package tech.kbtg.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car civic = new Car();
        civic.setEngine("combustion engine");
        civic.setController("steering wheel");
        civic.setName("รถ");
//        register(civic);
//        System.out.println(civic.move());
//
        AirPlane aribus370 = new AirPlane();
        aribus370.setEngine("turbine engine");
        aribus370.setController("joystick");
        aribus370.setName("เครื่องบิน");
//        register(aribus370);
//        System.out.println(aribus370.move());
//        aribus370.setBlackBox("Log 1");
//        System.out.println(aribus370.getBlackBox());
//        System.out.println(aribus370.getBlackBox("555"));
//
        Ship ship = new Ship();
        ship.setEngine("combustion engine");
        ship.setController("helm");
        ship.setName("เรื่อ");
//        ship.setName("ลอยยยยยยยยยยย");
//        register(ship);

        List<Vehicle> vehicles = new ArrayList<>(1);
        vehicles.add(civic);
        vehicles.add(aribus370);
        vehicles.add(ship);

        Set<String> name =
                vehicles.stream()
                .filter(it -> it instanceof AirPlane) // stream :: Vehicle -> AirPlane
                .map(it -> it.getName()) // stream String
                .collect(Collectors.toSet());

//        System.out.println("Names " + name);

        HelloPrint helloPrint = new HelloPrint();
        doPrint(helloPrint, "Sompol");

        helloPrint.printX();

        Printable p = (s) -> System.out.println("FunctionalInterface print " + s);
        doPrint(p, "Sompol");
    }

    public static void register(Vehicle c) {
        System.out.println(c.getClass() + " register as " + c.getName());
    }

    public static void doPrint(Printable p, String s) {
        p.print(s);
    }
}
