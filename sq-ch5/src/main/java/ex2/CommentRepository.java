package ex2;

import org.springframework.stereotype.Service;

@Service
public class CommentRepository {
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}