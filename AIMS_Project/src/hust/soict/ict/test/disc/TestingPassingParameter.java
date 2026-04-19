package hust.soict.ict.test.disc;

import hust.soict.ict.aims.disc.DVD;

public class TestingPassingParameter {
    
    public static void main(String[] args) {
        
        DVD jungle = new DVD("Jungle");
        DVD cinderella = new DVD("Cinderella");

        swap(jungle, cinderella);
        System.out.println("Jungle DVD title: " + jungle.getTitle());
        System.out.println("Cinderella DVD title: " + cinderella.getTitle());

        changeTitle(jungle, cinderella.getTitle());
        System.out.println("Jungle DVD title: " + jungle.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DVD dvd, String new_title) {
        
        String old = dvd.getTitle();
        dvd.setTitle(new_title);
        dvd = new DVD(old);
    }
}
