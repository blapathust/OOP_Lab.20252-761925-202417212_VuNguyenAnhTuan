package hust.soict.ict.test.cart;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.DVD;

import java.util.ArrayList;

public class CartTest {
    public static void main(String[] args) {
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

        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Aladin");
        keywords.add("Star");
        cart.searchByTitle(keywords).forEach(dvd -> System.out.println(dvd.DVDtoString(dvd)));
    }
}
