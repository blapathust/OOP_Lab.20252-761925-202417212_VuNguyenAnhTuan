package hust.soict.ict.aims.cart;

<<<<<<< HEAD
import hust.soict.ict.aims.media.CD;
import hust.soict.ict.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;
=======
import hust.soict.ict.aims.disc.DVD;
import java.util.ArrayList;
import java.util.LinkedList;
>>>>>>> 55ae38ac4b4d5cfdd8c91e878eeba02dd428d6e5

public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    protected float cost = 0;

<<<<<<< HEAD
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

    boolean equals(CD.Track track1, CD.Track track2) {
        return track1.getTitle().equals(track2.getTitle()) && track1.getLength() == track2.getLength();
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
=======
    private LinkedList<DVD> itemsOrdered = new LinkedList<>();

    public void addDVD(DVD dvd)
    {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            
            System.out.println("Your cart is full, no new item can be added.");

            return;
        }

        String added = dvd.getTitle();

        cost += dvd.getCost();

        itemsOrdered.add(dvd);

        System.out.println("Added " + added + " to cart.");

        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) System.out.println("Your cart is full, no new item can be added.");
    }

    public void addDVD(DVD dvd1, DVD dvd2)
    {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            
            System.out.println("Your cart is full, no new item can be added.");

            return;
        }

        String added = dvd1.getTitle() + " and " + dvd2.getTitle();

        cost += dvd1.getCost() + dvd2.getCost();

        itemsOrdered.add(dvd1);
        itemsOrdered.add(dvd2);

        System.out.println("Added " + added + " to cart.");

        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) System.out.println("Your cart is full, no new item can be added.");
    }

    public void removeDVD(DVD dvd)
    {
        String removed = dvd.getTitle();

        cost -= dvd.getCost();

        itemsOrdered.remove(dvd);

        System.out.println("Removed " + removed + " from cart.");

        if (itemsOrdered.isEmpty()) System.out.println("Your cart empty.");
    }

    public float getCost()
    {
        return cost;
    }

    public void CartInfo()
    {
        int i = 1;

        System.out.println("***********************CART***********************");
        for (DVD dvd: itemsOrdered) {
            System.out.print(i + ". " + dvd.DVDtoString(dvd) + '\n');
            i++;
        }
        System.out.println("Total cost: " + cost + "$");
        System.out.println("**************************************************");
    }

    public DVD searchByID(int id)
    {
        for (DVD dvd: itemsOrdered) {
            if (dvd.getID() == id) return dvd;
        }

        return null;
    }

    public ArrayList<DVD> searchByTitle(ArrayList<String> keywords)
    {
        ArrayList<DVD> result = new ArrayList<>();

        for (DVD dvd: itemsOrdered) {

            String title = dvd.getTitle();

            for (String keyword: keywords) {
                if (title.contains(keyword)) {

                    result.add(dvd);

                    break;
                }
            }

        }

        return result;
    }
>>>>>>> 55ae38ac4b4d5cfdd8c91e878eeba02dd428d6e5
}
