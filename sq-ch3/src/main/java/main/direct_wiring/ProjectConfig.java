package main.direct_wiring;

import main.direct_wiring.Parrot;
import main.direct_wiring.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "pp")
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Person person1() {
        var p = new Person();
        p.setName("Dima");
        p.setParrot(parrot1());
        return p;
    }
}
