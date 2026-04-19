package hust.soict.dsai.aims.disc;

public class DVD {
    
    private static int DVDnum = 0;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DVD(String name, String tag, String director_name, int runtime, float price)
    {
        this.title = name;
        this.category = tag;
        this.director = director_name;
        this.length = runtime;
        this.cost = price;

        DVDnum++;
    }

    public DVD(String name, String tag, float price)
    {
        this.title = name;
        this.category = tag;
        this.cost = price;

        DVDnum++;
    }

    public DVD(String name)
    {
        this.title = name;

        DVDnum++;
    }

    public String getTitle()
    {
        return title;
    }

    public String getCategory()
    {
        return category;
    }

    public String getDirector()
    {
        return director;
    }

    public int getLength()
    {
        return length;
    }

    public float getCost()
    {
        return cost;
    }

    public void setTitle(String input)
    {
        this.title = input;
    }

    public String DVDtoString(DVD dvd)
    {
        StringBuilder sb = new StringBuilder();
        boolean any = false;

    sb.append("DVD - ").append(dvd.getTitle());

    if (category != null && !category.isBlank()) {
        if (!any) { sb.append(" - ").append(dvd.getCategory()); any = true; }
        else sb.append(" - ").append(dvd.getCategory());
    }

    if (director != null && !director.isBlank()) {
        if (!any) { sb.append("DVD - ").append(dvd.getDirector()); any = true; }
        else sb.append(" - ").append(dvd.getDirector());
    }

    if (length > 0) {
        if (!any) { sb.append(" - ").append(dvd.getLength()); any = true; }
        else sb.append(" - ").append(dvd.getLength());
    }

    if (cost > 0.0f) {
        if (!any) sb.append(" - ").append(String.format("%.2f", cost)).append("$");
        else sb.append(": ").append(String.format("%.2f", cost)).append("$");
    }

    return sb.toString();
    }
}

