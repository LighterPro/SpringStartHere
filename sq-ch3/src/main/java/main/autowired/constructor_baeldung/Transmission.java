package main.autowired.constructor_baeldung;

public class Transmission {
    String name;

    public Transmission(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "name='" + name + '\'' +
                '}';
    }
}
