package hust.soict.ict.aims.cart;

import hust.soict.ict.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    protected float cost = 0;

    private ArrayList<Media> itemsOrdered = new ArrayList<>();

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

    public boolean findMedia(Media media) {
        for (Media item : itemsOrdered) {
            if (equals(item, media)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Media> searchByTitle(ArrayList<String> keywords) {
        ArrayList<Media> result = new ArrayList<>();
        for (Media media : itemsOrdered) {
            for (String keyword : keywords) {
                if (media.getTitle().contains(keyword)) {
                    result.add(media);
                    break;
                }
            }
        }
        return result;
    }

    public Media searchById(int id) {
        for (Media media : itemsOrdered) 
            if (media.getId() == id) return media;

        return null;
    }

    public String CartInfo() {
        StringBuilder info = new StringBuilder("***********************CART***********************\n");
        for (int i = 1; i < itemsOrdered.size() + 1; i++) {
            info.append(i).append(". ").append(itemsOrdered.get(i - 1).toString()).append("\n");
        }
        info.append("Total cost: ").append(cost).append("$\n");
        info.append("**************************************************");
        System.out.println(info.toString());
        return info.toString();
    }

    public void EmptyCart() {
        itemsOrdered.clear();
        cost = 0;
    }

    public Media searchByTitle_Perfect(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }

    public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
}
