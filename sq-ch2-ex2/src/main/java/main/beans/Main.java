package main.beans;

import config.ProjectConfig_Beans;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig_Beans.class);

//        var p = context.getBean(Parrot.class);
//
//        var p1 = context.getBean("L", Parrot.class);
        var p2 = context.getBean("L", Parrot.class);
//        var p3 = context.getBean("Riki", Parrot.class);

//        System.out.println(p.getName());
//
//        System.out.println(p1.getName());
        System.out.println(p2.getName());
//        System.out.println(p3.getName());
//        System.out.println(context.getBean(String.class));
//        System.out.println(context.getBean(Integer.class));

    }
}
