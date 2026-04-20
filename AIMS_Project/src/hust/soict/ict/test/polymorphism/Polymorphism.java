package hust.soict.ict.test.polymorphism;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.CD;
import hust.soict.ict.aims.media.DVD;
import hust.soict.ict.aims.media.Media;
import java.util.ArrayList;

public class Polymorphism {

    public static void main(String[] args) {
        
        ArrayList<Media> mediaList = new ArrayList<Media>();

        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        mediaList.add(dvd1);

        CD cd1 = new CD("Thriller", "Pop", "Michael Jackson", 180, 14.99f);
        mediaList.add(cd1);

        Book book1 = new Book("The Great Gatsby", "Novel", 10.99f);
        book1.addAuthor("F. Scott Fitzgerald");
        mediaList.add(book1);

        for (Media media : mediaList) System.out.println(media.toString());
    }


}
