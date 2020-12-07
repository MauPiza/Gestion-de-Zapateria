package dao;

import config.DBHelper;
import entities.Article;
import entities.Catalogue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Article_impl implements DAO_Article{
    Catalogue catalogueClass = new Catalogue();
    DBHelper helper = new DBHelper();
    
    @Override
    public boolean create(Article article) {
        
        try {
            if (helper.connect()) {

                StringBuilder query = new StringBuilder();
                query.append("INSERT INTO article VALUES(");
                query.append(0);
                query.append(",").append(article.getId_catalogue()).append(",");
                query.append("'").append(article.getName_article()).append("',");
                query.append(article.getPrice()).append(",");
                query.append(article.getExistance());
                query.append(");");
            
                helper.execute(query.toString(), true);
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "No es posible establecer conexión con"
                        + "la base de datos");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error has been ocurred: " + helper.getMensajeError());
            System.out.println("Posibly mistake: JDBC Driver not imported yet");
        }finally{
            helper.disconnect();
        }
        return false;
        
    }

    @Override
    public Article readOne(int id_article) {
        
        Article article = new Article();
        try {
            if (helper.connect()) {
             
                StringBuilder query = new StringBuilder();
                query.append("SELECT name_article, id_catalogue FROM article WHERE id_article = ");
                query.append(id_article).append(";");
                
                ResultSet rs = (ResultSet)helper.execute(query.toString(), false);
                if(rs.next()){
                    article.setName_article(rs.getString("name_article")); 
                    article.setId_catalogue(rs.getInt("id_catalogue"));
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
                }
                
                return article;
                
            }
        } catch (SQLException e) {
            System.out.println("Error has been ocurred: " + helper.getMensajeError());
        }finally{
            helper.disconnect();
        }
        return article;
        
    }

    @Override
    public boolean update(int id_article, Article article) {
        try {
            if (helper.connect()) {

                StringBuilder query = new StringBuilder();
                query.append("UPDATE article SET ");
                query.append("id_catalogue = ").append(article.getId_catalogue()).append(",");
                query.append("name_article = '").append(article.getName_article()).append("',");
                query.append("price = ").append(article.getPrice()).append(",");
                query.append("existance =").append(article.getExistance());
                query.append(" WHERE id_article = ").append(id_article).append(";");
            
                helper.execute(query.toString(), true);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "No es posible establecer conexión con"
                        + "la base de datos");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error has been ocurred: " + helper.getMensajeError());
            System.out.println("Posibly mistake: JDBC Driver not imported yet");
        }finally{
            helper.disconnect();
        }
        return false;
    }

    @Override
    public boolean delete(int id_article) {
        try {
            if (helper.connect()) {

                StringBuilder query = new StringBuilder();
                query.append("DELETE FROM article WHERE id_article = ").append(id_article).append(";");
                helper.execute(query.toString(), true);
                if (true) {
                    
                }
                JOptionPane.showMessageDialog(null, "Se ha eliminado un elemento de la base de datos "
                        + "con el ID: " + id_article);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "No es posible establecer conexión con"
                        + "la base de datos");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error has been ocurred: " + helper.getMensajeError());
            System.out.println("Posibly mistake: JDBC Driver not imported yet");
        }finally{
            helper.disconnect();
        }
        return false;
    }

    @Override
    public List<Article> getAllArticles() {
        List <Article> articleList = new ArrayList();
        
        try {
            if (helper.connect()) {
                StringBuilder query = new StringBuilder();
                query.append("SELECT * FROM articles");
                ResultSet rs = (ResultSet) helper.execute(query.toString(), false);
                while (rs.next()) {        
                    Article article = new Article();
                    
                    article.setId_article(rs.getInt("id_article"));
                    article.setId_catalogue(rs.getInt("id_catalogue"));
                    article.setName_article(rs.getString("name_article"));
                    article.setPrice(rs.getInt("price"));
                    article.setExistance(rs.getInt("existance"));
                    
                    articleList.add(article);
                }
            }else{
                System.out.println("No es posible conectarse a la base de datos ");
            }
        } catch (SQLException e) {
            System.out.println("Error has been ocurred " + helper.getMensajeError());
        }
        
        return articleList;
    }
    
    //Check if the stock of the catalog is available
    private boolean  isAvailableStock(){
        boolean available;
        if (catalogueClass.getStock().size() >= 0 && catalogueClass.getStock().size()<= 30) {
            available = true;
            return available;
        }else{
            available = false;
            return available;
        }
    }

    @Override
    public List<Article> getBy(String column, String data) {
        List<Article> articleList = new ArrayList();
        
        try {
            if (helper.connect()) {
                StringBuilder query = new StringBuilder();
                query.append("SELECT * FROM articles WHERE ");
                if (column.equals("id_article") || column.equals("id_catalogue") || column.equals("existance") || column.endsWith("price") ) {
                    query.append(column).append(" = ").append(data);
                }else if (column.equals("name_article")) {
                    query.append("LIKE '%").append(data).append("%'");
                }
                ResultSet rs = (ResultSet) helper.execute(query.toString(), false);
                while (rs.next()) {        
                    Article article = new Article();
                    
                    article.setId_article(rs.getInt("id_article"));
                    article.setId_catalogue(rs.getInt("id_catalogue"));
                    article.setName_article(rs.getString("name_article"));
                    article.setPrice(rs.getInt("price"));
                    article.setExistance(rs.getInt("existance"));
                    
                    articleList.add(article);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error has been detected " + helper.getMensajeError());
        }finally{
            helper.disconnect();
        }
        
        return articleList;
    }
    
    
}
