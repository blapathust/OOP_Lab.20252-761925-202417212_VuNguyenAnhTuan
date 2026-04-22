package hust.soict.ict.aims.cli;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.Disc;
import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.store.Store;
import java.util.Scanner;

public abstract class ViewStore {

    static final Scanner scanner = AIMS.scanner;

    public static int storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static int OptionsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static void viewStore(Store store, Cart cart) {

        int input;
        while (true) {

            System.out.println("View store");
            System.out.println("--------------------------------");

            for (int i = 0; i < store.size(); i++) {
                System.out.println((i + 1) + ". " + store.get(i).toString());
            }
            input = storeMenu();

            if (input == 0) break;
            if (input == 1) {
                System.out.println("Enter title: ");
                String title = scanner.nextLine();
                Media media = store.searchByTitle_Perfect(title);
                if (media != null) {
                    System.out.println("Media found!\n" + media.toString());

                    while (input != 0) {
                        input = OptionsMenu();
                        if (input == 1) {
                            cart.addMedia(media);
                        }
                        if (input == 2) {
                            if (media instanceof Disc disc) disc.play();
                            else System.out.println("The media cannot be played.");
                        }
                    }

                } else {
                    System.out.println("Media not found.");
                }
            }
            if (input == 2) {
                System.out.println("Enter title: ");
                String title = scanner.nextLine();
                Media media = store.searchByTitle_Perfect(title);
                if (media != null) {
                    cart.addMedia(media);
                } else {
                    System.out.println("Media not found.");
                }
            }
            if (input == 3) {
                System.out.println("Enter title: ");
                String title = scanner.nextLine();
                Media media = store.searchByTitle_Perfect(title);
                if (media != null) {
                    if (media instanceof Disc disc) disc.play();
                    else {
                        System.out.println("The media cannot be played.");
                    }
                } else {
                    System.out.println("Media not found.");
                }    
            }
            if (input == 4) {
                cart.CartInfo();
            }
        }
    }
}
