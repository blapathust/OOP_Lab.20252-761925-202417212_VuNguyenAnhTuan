package hust.soict.ict.aims.media;

public class Disc extends Media implements Playable {

    private String director;
    private int length;

    public Disc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + "$";
    }

    @Override
    public void play() {
        System.out.println("Playing disc: " + this.getTitle());
        System.out.println("Disc length: " + this.getLength());
    }
}
