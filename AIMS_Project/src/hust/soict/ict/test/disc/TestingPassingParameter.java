package hust.soict.ict.test.disc;

<<<<<<< HEAD
import hust.soict.ict.aims.media.DVD;
=======
import hust.soict.ict.aims.disc.DVD;
>>>>>>> 55ae38ac4b4d5cfdd8c91e878eeba02dd428d6e5

public class TestingPassingParameter {
    
    public static void main(String[] args) {
        
        DVD jungle = new DVD("Jungle", "Adventure", "Gregg Vanzo", 102, 19.95f);
        DVD cinderella = new DVD("Cinderella", "Romance", "Clyde Geronimi", 95, 18.99f);

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
        dvd = new DVD(old, dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
    }
}
