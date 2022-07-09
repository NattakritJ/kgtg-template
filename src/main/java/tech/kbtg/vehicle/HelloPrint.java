package tech.kbtg.vehicle;

public class HelloPrint implements Printable {
    @Override
    public void print(String s) {
        System.out.println("Hello " + s);
    }

    public void printX() {
        System.out.println("yyyyyyyyyyyyy");
    }
}
