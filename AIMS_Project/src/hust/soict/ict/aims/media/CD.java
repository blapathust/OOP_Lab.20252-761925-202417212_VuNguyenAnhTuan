package hust.soict.ict.aims.media;

import java.util.ArrayList;

public class CD extends Disc implements Playable {

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

        public void play() { 
            System.out.println("Playing DVD: " + this.getTitle()); 
            System.out.println("DVD length: " + this.getLength()); 
        }
    }

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

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

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() { 
        
        System.out.println("Playing CD: " + this.getTitle());

        for (Track track : tracks) {
            track.play();
        }
    }
}
