package hust.soict.ict.aims.media;

import java.util.ArrayList;

public class CD extends Disc {

    public CD(String title, String category, String director, int length, float cost) {

        super(title, category, director, length, cost);
    }

    public class Track implements Playable {
        private String title;
        private int length;

        public Track(String title, int length) {
            this.title = title;
            this.length = length;
        }

        public String getTitle() {
            return title;
        }

        public int getLength() {
            return length;
        }

        @Override
        public void play() {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        }

        @Override
        public String toString() {
            return this.getTitle() + ": " + this.getLength() + "s";
        }
    }

    private String artist;
    private final ArrayList<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in the CD.");
            return;
        }
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {

        System.out.println("Playing CD: " + this.getTitle());

        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {

        String result = "ID: " + this.getId() + " - CD - " + this.getTitle() + " - " + this.getCategory() + " - "
                + this.getArtist() + ": " + this.getCost() + "$";

        for (Track track : tracks) {
            result += "\n  " + track.toString();
        }

        return result;
    }
}
