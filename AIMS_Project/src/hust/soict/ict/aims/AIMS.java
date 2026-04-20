package hust.soict.ict.aims;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.DVD;

class AIMS
{
    public static void main(String args[])
    {
        Cart anOrder = new Cart();

        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DVD dvd3 = new DVD("Aladdin", "Animation", "Ron Clements", 90, 18.99f);
        anOrder.addMedia(dvd3);

        System.out.println("Total cost is: " + anOrder.getCost());

        anOrder.removeMedia(dvd3);

        System.out.println("Total cost is: " + anOrder.getCost());
    }
}