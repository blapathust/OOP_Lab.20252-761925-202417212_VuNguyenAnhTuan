package hust.soict.ict.test.cart;

import hust.soict.ict.aims.cart.Cart;
<<<<<<< HEAD
import hust.soict.ict.aims.media.DVD;
import hust.soict.ict.aims.media.Media;
=======
import hust.soict.ict.aims.disc.DVD;
>>>>>>> 55ae38ac4b4d5cfdd8c91e878eeba02dd428d6e5
import java.util.ArrayList;

public class CartTest {
    public static void main(String[] args) {
<<<<<<< HEAD
        Cart cart = new Cart();

        DVD dvd1 = new DVD("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DVD dvd2 = new DVD("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DVD dvd3 = new DVD("Aladin",
                "Animation", "Ron Clements", 90, 18.99f);
        cart.addMedia(dvd3);

        cart.CartInfo();
        Media target = cart.searchById(3);
        System.out.println(target.toString());
=======
        //Create a new cart
        Cart cart = new Cart();

        //Create new dvd objects and add them to the cart
        DVD dvd1 = new DVD("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addDVD(dvd1);

        DVD dvd2 = new DVD("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDVD(dvd2);

        DVD dvd3 = new DVD("Aladin",
                "Animation", 18.99f);
        cart.addDVD(dvd3);

        //Test the print method
        cart.CartInfo();
        //To-do: Test the search methods here
        DVD target = cart.searchByID(3);
        System.out.println(target.DVDtoString(target));
>>>>>>> 55ae38ac4b4d5cfdd8c91e878eeba02dd428d6e5

        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Aladin");
        keywords.add("Star");
<<<<<<< HEAD
        cart.searchByTitle(keywords).forEach(dvd -> System.out.println(dvd.toString()));
=======
        cart.searchByTitle(keywords).forEach(dvd -> System.out.println(dvd.DVDtoString(dvd)));
>>>>>>> 55ae38ac4b4d5cfdd8c91e878eeba02dd428d6e5
    }
}
