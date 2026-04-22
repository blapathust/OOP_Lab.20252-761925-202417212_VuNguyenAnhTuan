package hust.soict.ict.aims.store;

import hust.soict.ict.aims.media.Media;
import java.util.ArrayList;

public class Store {

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
    }
}
