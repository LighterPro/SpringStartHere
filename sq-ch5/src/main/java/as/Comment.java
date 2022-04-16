package as;

public class Comment {
    String author;
    String text;

    public Comment(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "as.Comment{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
