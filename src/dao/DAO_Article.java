package dao;

import entities.Article;
import java.util.List;

public interface DAO_Article {
    public boolean create(Article article);
    public Article readOne(int id_article);
    public boolean update(int id_article, Article article);
    public boolean delete(int id_article);
    
    public List<Article> getBy(String column, String data);
    public List<Article> getByCatalogue(int id_catalogue);
    public List<Article> getAllArticles();
    
    public boolean stockAvailable(int id_catalogue);
}
