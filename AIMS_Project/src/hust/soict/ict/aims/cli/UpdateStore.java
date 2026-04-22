package hust.soict.ict.aims.cli;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.CD;
import hust.soict.ict.aims.media.DVD;
import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.store.Store;
import java.util.Scanner;

public class UpdateStore {

    public static void updateStore(Store store) {
        System.out.println("Update store");
        System.out.println("--------------------------------");
        Scanner scanner = AIMS.scanner;

        int input;
        while (true) {

            store.toString();

            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media");
            System.out.println("2. Remove a media");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");

            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 0)
                break;
            if (input == 1) {
                System.out.println("Choose media type (1 - Book, 2 - CD, 3 - DVD, 0 - Back): ");
                input = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter title: ");
                String title = scanner.nextLine();
                System.out.println("Enter category: ");
                String category = scanner.nextLine();
                System.out.println("Enter cost: ");
                float cost = scanner.nextFloat();

                switch (input) {
                    case 1 -> {
                        Book book = new Book(title, category, cost);
                        store.addMedia(book);
                        continue;
                    }
                    case 2 -> {
                        System.out.println("Enter length: ");
                        int length = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter director: ");
                        String dir = scanner.nextLine();

                        CD cd = new CD(title, category, dir, length, cost);
                        store.addMedia(cd);
                        continue;
                    }
                    case 3 -> {
                        System.out.println("Enter length: ");
                        int len = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter director: ");
                        String director = scanner.nextLine();

                        DVD dvd = new DVD(title, category, director, len, cost);
                        store.addMedia(dvd);
                        continue;
                    }
                    default -> {
                        continue;
                    }
                }
            }

            if (input == 2) {
                System.out.println("Enter title: ");
                String title = scanner.nextLine();

                Media target = store.searchByTitle_Perfect(title);
                if (target != null) {
                    store.removeMedia(target);
                } else {
                    System.out.println("Media not found.");
                }
            }
        }
    }
}
