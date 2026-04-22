package hust.soict.ict.test.cart;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.DVD;
import hust.soict.ict.aims.media.Media;
import java.util.ArrayList;

public class CartTest {
    public static void main(String[] args) {
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

        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Aladin");
        keywords.add("Star");
        cart.searchByTitle(keywords).forEach(dvd -> System.out.println(dvd.toString()));
    }
}
