package main.autowired.deadlock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Lulu";
    private final Person person;

    @Autowired
    public Parrot(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}
