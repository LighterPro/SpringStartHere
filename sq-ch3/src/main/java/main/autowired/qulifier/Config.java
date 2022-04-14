package main.autowired.qulifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main.autowired.qulifier")
public class Config {
    @Bean
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Sasa");
        return p;
    }

    @Bean
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Lele");
        return p;
    }
}
