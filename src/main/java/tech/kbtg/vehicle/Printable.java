package tech.kbtg.vehicle;

@FunctionalInterface
public interface Printable {

    void print(String s);

    default void printX() {
        System.out.println("xxxxxxxxxxxx");
    }
}
