package entities;


public class Article {
    private int id_article;
    private int id_catalogue;// the ID is a catalogue type (SHOE, CLOSED SHOE, HUARACHES)
    private String name_article;
    private double price;
    private int existance; //existance for each article

    public Article() {
    }

    public int getId_article() {
        return id_article;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public int getId_catalogue() {
        return id_catalogue;
    }

    public void setId_catalogue(int id_catalogue) {
        this.id_catalogue = id_catalogue;
    }

    public String getName_article() {
        return name_article;
    }

    public void setName_article(String name_article) {
        this.name_article = name_article;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExistance() {
        return existance;
    }

    public void setExistance(int existance) {
        this.existance = existance;
    }
    
    
}
