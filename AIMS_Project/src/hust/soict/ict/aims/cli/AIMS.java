package hust.soict.ict.aims.cli;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.store.Store;
import java.util.Scanner;

class AIMS {

    static Store store = new Store();
    static Cart cart = new Cart();

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                case 1 -> ViewStore.viewStore(store, cart);
                case 2 -> UpdateStore.updateStore(store);
                case 3 -> {
                    CartMenu cartMenu = new CartMenu();
                    cartMenu.showCartMenu(cart);
                }
                default -> System.out.println("Invalid input. Please choose a number from the menu.");
            }
        }
    }
}