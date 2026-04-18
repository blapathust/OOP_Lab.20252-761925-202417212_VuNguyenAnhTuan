package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DVD;

class AIMS
{
    public static void main(String args[])
    {
        Cart anOrder = new Cart();

        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDVD(dvd1);

        DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDVD(dvd2);

        DVD dvd3 = new DVD("Aladdin", "Animation", 18.99f);
        anOrder.addDVD(dvd3);

        System.out.println("Total cost is: " + anOrder.getCost());

        anOrder.removeDVD(dvd3);

        System.out.println("Total cost is: " + anOrder.getCost());
    }
}