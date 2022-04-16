package as;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

    void publishComment(Comment comment) {
        System.out.println("Was published: " + comment);

    }
}