package as;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var c1 = context.getBean(CommentService.class);
        var c2 = context.getBean(CommentService.class);

        System.out.println(c1 == c2);
    }
}
