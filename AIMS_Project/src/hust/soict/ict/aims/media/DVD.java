package hust.soict.ict.aims.media;

public class DVD extends Disc implements Playable {

    private int DVDnumber = 0;

    public DVD(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);

        DVDnumber++;
        this.setId(DVDnumber);
    }

    public String DVDtoString(DVD dvd)
    {
        return "DVD - " + dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost() + "$";
    }

    public void play() { 
        System.out.println("Playing DVD: " + this.getTitle()); 
        System.out.println("DVD length: " + this.getLength()); 
    } 
}
