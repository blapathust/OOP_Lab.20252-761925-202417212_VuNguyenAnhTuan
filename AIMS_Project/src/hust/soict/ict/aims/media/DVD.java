package hust.soict.ict.aims.media;

public class DVD extends Disc {

    private int DVDnumber = 0;

    public DVD(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setLength(length);
        this.setCost(cost);

        DVDnumber++;
        this.setId(DVDnumber);
    }

    public DVD(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);

        DVDnumber++;
        this.setId(DVDnumber);
    }

    public DVD(String title)
    {
        this.setTitle(title);

        DVDnumber++;
        this.setId(DVDnumber);
    }

    public String DVDtoString(DVD dvd)
    {
        return "DVD - " + dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost() + "$";
    }
}
