package main.autowired.setters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Olya";
    private Parrot parrot;

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", parrot=" + parrot +
                '}';
    }
}
