import java.util.LinkedList;

public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    protected float cost = 0;

    private LinkedList itemsOrdered = new LinkedList<DVD>();

    protected void addDVD(DVD dvd)
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

    protected void addDVD(DVD dvd1, DVD dvd2)
    {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            
            System.out.println("Your cart is full, no new item can be added.");

            return;
        }

        String added = dvd1.getTitle() + " and " + dvd2.getTitle();

        //cost += dvd1.getCost() + dvd2.getCost();

        itemsOrdered.add(dvd1);
        //itemsOrdered.add(dvd2);

        System.out.println("Added " + added + " to cart.");

        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) System.out.println("Your cart is full, no new item can be added.");
    }

    protected void removeDVD(DVD dvd)
    {
        String removed = dvd.getTitle();

        cost -= dvd.getCost();

        itemsOrdered.remove(dvd);

        System.out.println("Removed " + removed + " from cart.");

        if (itemsOrdered.isEmpty()) System.out.println("Your cart empty.");
    }

    protected float getCost()
    {
        return cost;
    }
}
