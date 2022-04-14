package main.autowired.constructor_baeldung;

public class Engine {
    String name;
    Integer engineCapacity;

    public Engine(String name, Integer engineCapacity) {
        this.name = name;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}


