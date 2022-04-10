package main.direct_wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean("person1", Person.class);
        Parrot parrot = context.getBean("pp", Parrot.class);
        System.out.println(person);
        System.out.println(parrot);

    }
}
