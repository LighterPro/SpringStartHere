package main.autowired.constructor_baeldung;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main.autowired.constructor_baeldung")
public class Config {
    @Bean
    public Engine engine() {
        return new Engine("v8", 5);
    }

    @Bean
    public Transmission transmission() {
        return new Transmission("sliding");
    }


}
