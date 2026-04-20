package hust.soict.ict.aims.cart;

import hust.soict.ict.aims.media.CD;
import hust.soict.ict.aims.media.Media;
import java.util.ArrayList;

public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    protected float cost = 0;

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            cost += media.getCost();
            System.out.println("The media has been added");
        } else {
            System.out.println("The cart is full. Cannot add more media.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            cost -= media.getCost();
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not in the cart.");
        }
    }

    public float getCost() {
        return cost;
    }

    boolean equals(Media media1, Media media2) {
        return media1.getTitle().equals(media2.getTitle());
    }

    boolean equals(CD.Track track1, CD.Track track2) {
        return track1.getTitle().equals(track2.getTitle()) && track1.getLength() == track2.getLength();
    }
}
