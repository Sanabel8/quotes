package quotes;
public class Quote {
    String[] tages;
    String author;
    String likes;
    String text;

    public Quote(String[] tages, String author, String likes, String text) {
        this.tages = tages;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String[] getTages() {
        return tages;
    }

    public void setTages(String[] tages) {
        this.tages = tages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
