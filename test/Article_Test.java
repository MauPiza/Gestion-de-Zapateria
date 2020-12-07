import dao.Article_impl;
import entities.Article;
import java.sql.SQLException;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class Article_Test {
    
    public Article_Test() {
    }
    
//    @Test //checkSpaceInStock PASSED
//    public void resultShouldReturnNegativeNumber(){
//        Article_impl articleImplements = new Article_impl();
//        Catalogue c = new Catalogue();
//        Article article = new Article();
//        for (int i = 0; i < 40; i++) {
//            article.setExistance(i+1);
//            c.getStock().add(article);
//        }
//        assertEquals( "The result must be -10", -10,articleImplements.checkSpaceInStock(article.getExistance(),30));
//    }
    
    @Test
    public void shouldAddAnArticle(){
        Article_impl articleImplements = new Article_impl();
        Article article = new Article();
        assertEquals("Should return true", true, articleImplements.create(article));
    }
    
    @Test
    public void shouldFindAnArticle(){
        Article_impl articleImplements = new Article_impl();
        assertEquals("Should return true", true, articleImplements.readOne(3));
    }
    
    @Test
    public void validateStructureOfQueryAdd(){
        Article article = new Article();
        article.setId_catalogue(2);
        article.setName_article("Producto de prueba");
        article.setPrice(500);
        article.setExistance(10);
        StringBuilder query = new StringBuilder();
            query.append("INSERT INTO article (id_article,id_catalogue,name_article,price,existance)")
            .append("VALUES (");
            query.append("NULL,");
            query.append(article.getId_catalogue()).append(",");
            query.append("'").append(article.getName_article()).append("',");
            query.append(article.getPrice()).append(",");
            query.append(article.getExistance());
            
            
            query.append(");");
            
            System.out.println("INSERT query: " + query.toString());
    }
    
    @Test
    public void validateStrucuteOfQueryFindOne() throws SQLException{
        
        int id_article = 3;
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM article WHERE id_article =");
        query.append(id_article + ";");
        System.out.println("SELECT query: " + query.toString());
    }
    
    @Test
    public void validateStructureOfQueryUpdate(){
        StringBuilder query = new StringBuilder();
        Article article = new Article();
        article.setId_catalogue(1);
        article.setName_article("Producto");
        article.setPrice(680);
        article.setExistance(25);
        
        query.append("UPDATE article SET ");
        query.append("id_catalogue = ").append(article.getId_catalogue()).append(",");
        query.append("name_article = '").append(article.getName_article()).append("',");
        query.append("price = ").append(article.getPrice()).append(",");
        query.append("existance = ").append(article.getExistance());
        query.append(" WHERE id_article = ").append(3).append(";");
        System.out.println("UPDATE query: " + query.toString());
    }
    
    @Test
    public void validateStructureOfQueryDelete(){
        Article article = new Article();
        article.setId_article(20);
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM article");
        query.append(" WHERE id_article = ").append(article.getId_article()).append(";");
        System.out.println("DELETE query: " + query.toString());
    }
    
}
