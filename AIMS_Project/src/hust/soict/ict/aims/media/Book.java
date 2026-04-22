package hust.soict.ict.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }

    private List<String> authors = new ArrayList<String>();

    @Override
    public String toString() {
        return "ID: " + this.getId() + " - Book - " + getTitle() + " - " + getCategory() + " - " + getCost() + "$ - "
                + getAuthors();
    }
}
