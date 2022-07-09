package tech.kbtg.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverseaTransportTest {

    @Test
    void airplaneShouldBeFly() {
        OverseaTransport overseaTransport = new OverseaTransport();

        AirPlane airPlane = new AirPlane();

        String go = overseaTransport.go(airPlane);

        assertEquals("I'am Flyyyyyyyyyyyyyyyyyy", go);
    }

    @Test
    void balloonShouldBeFly() {
        OverseaTransport overseaTransport = new OverseaTransport();
        Balloon balloon = new Balloon();

        String go = overseaTransport.go(balloon);

        assertEquals("I'am Ummmmmmmmmmmmm", go);
    }

    @Test
    void someThingShouldBeFly() {
        OverseaTransport overseaTransport = new OverseaTransport();

        Flyable f = () -> "UFO is flyyyyyyy";

        String go = overseaTransport.go(f);

        assertEquals("UFO is flyyyyyyy", go);
    }

    @Test
    void shipShouldBeFloat() {
        OverseaTransport overseaTransport = new OverseaTransport();
        Ship ship = new Ship();

        String go = overseaTransport.go(ship);

        assertEquals("Veeeeeeeeeeeeeeeeeee", go);
    }
}
