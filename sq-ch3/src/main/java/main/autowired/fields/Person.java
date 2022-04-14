package main.autowired.fields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {
    private String name;

    @Autowired
    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @PostConstruct
    private void init() {
        this.name = "Dima";
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", parrot=" + parrot +
                '}';
    }
}
