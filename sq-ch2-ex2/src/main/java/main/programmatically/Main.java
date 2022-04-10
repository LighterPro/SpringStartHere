package main.programmatically;

import config.ProjectConfig_Components;
import config.ProjectConfig_Programmatically;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig_Programmatically.class);

        var parrot1 = new Parrot();
        parrot1.setName("Koko");

        Supplier<Parrot> parrotSupplier = () -> parrot1;

        context.registerBean("parrot1", Parrot.class, parrotSupplier,
                beanDefinition -> beanDefinition.setPrimary(true));

        var parrot2 = new Parrot();
        parrot2.setName("Gaga");

        parrotSupplier = () -> parrot2;

        context.registerBean("parrot2", Parrot.class, parrotSupplier);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());
    }
}
