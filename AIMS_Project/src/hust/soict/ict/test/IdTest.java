package hust.soict.ict.test;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.DVD;
import hust.soict.ict.aims.media.CD;

public class IdTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Media ID Assignment ===");
        
        DVD dvd1 = new DVD("DVD-1", "Action", "Director1", 120, 10.0f);
        System.out.println("DVD-1 ID (expect 1): " + dvd1.getId());
        
        DVD dvd2 = new DVD("DVD-2", "Comedy", "Director2", 90, 12.0f);
        System.out.println("DVD-2 ID (expect 2): " + dvd2.getId());
        
        Book book1 = new Book("Book-1", "Fiction", 15.0f);
        System.out.println("Book-1 ID (expect 3): " + book1.getId());
        
        CD cd1 = new CD("CD-1", "Pop", "Artist1", 180, 14.0f);
        System.out.println("CD-1 ID (expect 4): " + cd1.getId());
        
        Book book2 = new Book("Book-2", "Science", 20.0f);
        System.out.println("Book-2 ID (expect 5): " + book2.getId());
        
        System.out.println("\nTotal mediaNumber: " + hust.soict.ict.aims.media.Media.getMediaNumber());
    }
}
