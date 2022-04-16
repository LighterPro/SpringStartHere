package ex7;

import ex6.Comment;

public class CommentSetvice {
    public void sendComment(Comment comment) {
        CommentProcessor commentProcessor = new CommentProcessor();

        commentProcessor.setComment(comment);
        commentProcessor.processComment(comment);
        commentProcessor.validateComment(comment);

        comment = commentProcessor.getComment();
    }
}
