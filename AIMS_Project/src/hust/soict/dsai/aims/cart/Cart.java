package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DVD;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    protected float cost = 0;

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
}
