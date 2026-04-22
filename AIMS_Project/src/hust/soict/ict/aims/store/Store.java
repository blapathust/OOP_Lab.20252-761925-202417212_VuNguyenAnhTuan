package hust.soict.ict.aims.store;

<<<<<<< HEAD
import hust.soict.ict.aims.media.Media;
=======
import hust.soict.ict.aims.disc.DVD;

>>>>>>> 55ae38ac4b4d5cfdd8c91e878eeba02dd428d6e5
import java.util.ArrayList;

public class Store {

<<<<<<< HEAD
    ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media)
    {
        itemsInStore.add(media);
        System.out.println("Added " + media.getTitle() + " to store.");
    }

    public void removeMedia(Media media)
    {
        itemsInStore.remove(media);
        System.out.println("Removed " + media.getTitle() + " from store.");
    }

    @Override
    public String toString() {
        System.out.println("Store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
        return "";
    }

    public int size() {
        return itemsInStore.size();
    }

    public Media get(int index) {
        if (index >= 0 && index < itemsInStore.size()) {
            return itemsInStore.get(index);
        }
        return null;
    }

    public Media searchByTitle_Perfect(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
=======
    ArrayList<DVD> itemsInStore = new ArrayList<>();

    public void addDVD(DVD dvd)
    {
        itemsInStore.add(dvd);
        System.out.println("Added " + dvd.getTitle() + " to store.");
    }

    public void removeDVD(DVD dvd)
    {
        itemsInStore.remove(dvd);
        System.out.println("Removed " + dvd.getTitle() + " from store.");
>>>>>>> 55ae38ac4b4d5cfdd8c91e878eeba02dd428d6e5
    }
}
