package entities;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
     public static final int SHOES = 1;
     public static final int CLOSED_SHOES = 2;
     public static final int SNEAKERS = 3;
     public static final int HUARACHES = 4;
     
     //Global stock (30 MAX)
     private List<Article> stock = new ArrayList();

    public Catalogue() {
    }

    public List<Article> getStock() {
        return stock;
    }

    public void setStock(List<Article> stock) {
        this.stock = stock;
    }
    
}
