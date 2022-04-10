package main.not_direct_wiring;


import org.springframework.beans.factory.annotation.Qualifier;
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
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Givi");
        return p;
    }

    @Bean
    Person person1(@Qualifier("parrot2") Parrot parrot) {
        var p = new Person();
        p.setName("Dima");
        p.setParrot(parrot);
        return p;
    }
}
