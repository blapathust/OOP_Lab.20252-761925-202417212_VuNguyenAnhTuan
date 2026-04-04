public class DVD {
    
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
    }

    public DVD(String name, String tag, float price)
    {
        this.title = name;
        this.category = tag;
        this.cost = price;
    }

    public DVD(String name)
    {
        this.title = name;
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
}
