package config;

import main.beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig_Beans {

    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(name = "L")
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

    @Bean(name = "L")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }



    @Bean
    String helloString() {
        return "Hello!";
    }

    @Bean
    Integer integer() {
        return 20;
    }

}
