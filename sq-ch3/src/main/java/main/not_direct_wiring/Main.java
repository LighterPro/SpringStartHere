package main.not_direct_wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean("parrot12343",Parrot.class);
        System.out.println(person);
        System.out.println(parrot);

    }
}
