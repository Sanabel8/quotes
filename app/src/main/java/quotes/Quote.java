package quotes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Quote {
 private String author;
 private String text;
 private String content;
 private String authorSlug;




    public Quote(String author,String text) {
        this.author = author;
        this.text = text;
    }
  public Quote(){}
    public Quote(String author, String content, String authorSlug){
        this.author=author;
        this.content=content;
        this.authorSlug=authorSlug;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorSlug() {
        return authorSlug;
    }

    public void setAuthorSlug(String authorSlug) {
        this.authorSlug = authorSlug;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        if (text==null)
            return "Quote{" +
                    "author='" + author + '\'' +
                    ", text='" + content+ '\'';
        else
            return "Quotes{" +
                    "author='" + author + '\'' +
                    ", text='" + text + '\'';
    }
}
