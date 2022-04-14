package main.autowired.qulifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
