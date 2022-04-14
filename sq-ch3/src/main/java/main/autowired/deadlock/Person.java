package main.autowired.deadlock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Olya";
    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", parrot=" + parrot +
                '}';
    }
}
