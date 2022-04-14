package main.autowired.constructor_baeldung;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean(Car.class);
        System.out.println(car);
    }

}
