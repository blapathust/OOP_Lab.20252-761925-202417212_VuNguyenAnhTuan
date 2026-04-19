package hust.soict.ict.aims.media;

import java.util.ArrayList;

public class CD extends Disc{

    public CD(String title, String category, String director, int length, float cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setLength(length);
        this.setCost(cost);
    }

    public class Track {
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
}
