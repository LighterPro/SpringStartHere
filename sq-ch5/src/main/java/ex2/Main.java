package ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var c1 = context.getBean(CommentService.class);
        var c2 = context.getBean(UserService.class);

        System.out.println(c1.getCommentRepository() == c2.getCommentRepository());
    }
}
