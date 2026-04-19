package hust.soict.ict.aims.store;

import hust.soict.ict.aims.disc.DVD;
import java.util.ArrayList;

public class Store {

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
    }
}
