package hust.soict.ict.aims.cli;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.Disc;
import hust.soict.ict.aims.media.Media;
import java.util.ArrayList;
import java.util.Scanner;

public class CartMenu {

    static final Scanner scanner = new Scanner(System.in);

    public void showCartMenu(Cart cart) {
        int input;
        while (true) {
            cart.CartInfo();
            System.out.println("Cart Menu:");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort media in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("Please choose a number: 0-1-2-3-4-5-");
            input = scanner.nextInt();
            scanner.nextLine();

            OUTER:
            switch (input) {
                case 1 -> {
                    System.out.println("Filter by: 1. Title; 2. ID; 0. Back");
                    input = scanner.nextInt();
                    scanner.nextLine();

                    switch (input) {
                        case 1 -> {
                            System.out.println("Enter title keywords, separated by commas: ");
                            ArrayList<String> keyword = new ArrayList<>();
                            for (String k : scanner.nextLine().split(",")) {
                                keyword.add(k.trim());
                            }
                            cart.searchByTitle(keyword).forEach(media -> System.out.println(media.toString()));
                    }
                        case 2 -> {
                            System.out.println("Enter ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            Media media = cart.searchById(id);
                            if (media != null) {
                                System.out.println(media.toString());
                            } else {
                                System.out.println("No media found.");
                            }
                    }
                        case 0 -> {
                    }
                        default -> System.out.println("Invalid option.");
                    }
                }
                case 2 -> {
                    System.out.println("Sort by: 1. Title; 2. Cost; 0. Back");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    switch (input) {
                        case 1 -> cart.sortByTitle();
                        case 2 -> cart.sortByCost();
                        case 0 -> {
                            break OUTER;
                    }
                        default -> System.out.println("Invalid option.");
                    }
                }
                case 3 -> {
                    System.out.println("Enter title of media to remove: ");
                    String title = scanner.nextLine();
                    Media mediaToRemove = cart.searchByTitle_Perfect(title);
                    if (mediaToRemove != null) {
                        cart.removeMedia(mediaToRemove);
                    } else {
                        System.out.println("Media not found in cart.");
                    }
                }
                case 4 -> {
                    System.out.println("Enter title of media to play: ");
                    String titleToPlay = scanner.nextLine();
                    Media mediaToPlay = cart.searchByTitle_Perfect(titleToPlay);
                    if (mediaToPlay != null) {
                        if (mediaToPlay instanceof Disc disc) disc.play();
                        else {
                            System.out.println("The media cannot be played.");
                        }
                    } else {
                        System.out.println("Media not found in cart.");
                    }
                }
                case 5 -> {
                    System.out.println("Order placed successfully!");
                    cart.EmptyCart();
                    return;
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
