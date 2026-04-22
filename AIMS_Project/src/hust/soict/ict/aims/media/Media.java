package hust.soict.ict.aims.media;

import java.util.Comparator;

public abstract class Media {

    private static int mediaNumber = 0;

    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;

        mediaNumber++;
        this.id = mediaNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public static int getMediaNumber() {
        return mediaNumber;
    }

    public static void setMediaNumber(int mediaNumber) {
        Media.mediaNumber = mediaNumber;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + "$";
    }
}
