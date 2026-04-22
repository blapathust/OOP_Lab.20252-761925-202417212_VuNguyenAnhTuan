package hust.soict.ict.test;

import hust.soict.ict.aims.media.CD;

public class CDTrackTest {
    public static void main(String[] args) {
        System.out.println("=== Testing CD with Tracks ===");
        
        CD cd = new CD("Thriller", "Pop", "Michael Jackson", 0, 14.99f);
        cd.setArtist("Michael Jackson");
        
        CD.Track t1 = cd.new Track("Beat It", 258);
        CD.Track t2 = cd.new Track("Billie Jean", 294);
        CD.Track t3 = cd.new Track("Beat It", 258);  // duplicate
        
        cd.addTrack(t1);
        cd.addTrack(t2);
        cd.addTrack(t3);  // should say "Track already exists"
        
        System.out.println("\nCD Info:");
        System.out.println(cd.toString());
        
        System.out.println("\nPlaying CD:");
        cd.play();
        
        System.out.println("\nCD length (sum of tracks): " + cd.getLength());
        
        // Test remove
        cd.removeTrack(t1);
        System.out.println("\nAfter removing 'Beat It':");
        System.out.println(cd.toString());
    }
}
