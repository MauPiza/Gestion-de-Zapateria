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
    List <Article> articleList = new ArrayList();
    
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
                query.append("SELECT * FROM article WHERE id_article = ");
                query.append(id_article).append(";");
                
                ResultSet rs = (ResultSet)helper.execute(query.toString(), false);               
                if(rs.next()){
                    article.setName_article(rs.getString("name_article")); 
                    article.setId_catalogue(rs.getInt("id_catalogue"));
                    article.setPrice(rs.getDouble("price"));
                    article.setExistance(rs.getInt("existence"));
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
                query.append("existence =").append(article.getExistance());
                query.append(" WHERE id_article = ").append(id_article).append(";");
            
                helper.execute(query.toString(), true);
                JOptionPane.showMessageDialog(null, "Producto actualizado");
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
        articleList = new ArrayList();
        
        try {
            if (helper.connect()) {
                StringBuilder query = new StringBuilder();
                query.append("SELECT * FROM article");
                ResultSet rs = (ResultSet) helper.execute(query.toString(), false);
                while (rs.next()) {        
                    Article article = new Article();
                    
                    article.setId_article(rs.getInt("id_article"));
                    article.setId_catalogue(rs.getInt("id_catalogue"));
                    article.setName_article(rs.getString("name_article"));
                    article.setPrice(rs.getDouble("price"));
                    article.setExistance(rs.getInt("existence"));
                    
                    articleList.add(article);
                }
            }else{
                System.out.println("No es posible conectarse a la base de datos ");
            }
        } catch (SQLException e) {
            System.out.println("Error has been ocurred: " + e.getSQLState());
        }finally{
            helper.disconnect();
        }
        
        return articleList;
    }

    @Override
    public List<Article> getBy(String column, String data) {
        articleList = new ArrayList();
        
        try {
            if (helper.connect()) {
                StringBuilder query = new StringBuilder();
                query.append("SELECT * FROM articles WHERE ");
                if (column.equals("id_article") || column.equals("id_catalogue") || column.equals("existence") || column.endsWith("price") ) {
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
                    article.setExistance(rs.getInt("existence"));
                    
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

    @Override
    public boolean stockAvailable(int id_catalogue) {
        /*
        try {
            if (helper.connect()) {
                
                StringBuilder query = new StringBuilder();
                query.append("SELECT COUNT(*) AS 'Total' FROM article WHERE id_catalogue = ")
                .append(id_catalogue).append(";");
                ResultSet rs = (ResultSet) helper.execute(query.toString(), false);
                
                if (rs.get) {
                    int stockTotal = rs.getInt("Total");
                    if (stockTotal <=30) {
                        System.out.println("Stock remmaining: " + stockTotal);
                        return true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Has alcanzado el límite de artículos"
                                    + " en este catálogo (30 artículos)");
                            return false;
                        }
                    }
                }else{
                    System.out.println("No es posible conectarse a la base de datos ");
                }
            } catch (Exception e) {
                System.out.println("Error has been ocurred: " + e.getMessage());
            }finally{
                helper.disconnect();
            }
        */
        return false;
        
    }

    @Override
    public List<Article> getByCatalogue(int id_catalogue) {

        try {
            if (helper.connect()) {
                StringBuilder query = new StringBuilder();
                query.append("SELECT * FROM article WHERE id_catalogue = ").append(id_catalogue);
                ResultSet rs = (ResultSet) helper.execute(query.toString(), false);
                while (rs.next()) {        
                    Article article = new Article();
                    
                    article.setId_article(rs.getInt("id_article"));
                    article.setId_catalogue(rs.getInt("id_catalogue"));
                    article.setName_article(rs.getString("name_article"));
                    article.setPrice(rs.getDouble("price"));
                    article.setExistance(rs.getInt("existence"));
                    
                    articleList.add(article);
                }
            }else{
                System.out.println("No es posible conectarse a la base de datos ");
            }
        } catch (SQLException e) {
            System.out.println("Error has been ocurred: " + e.getSQLState());
        }finally{
            helper.disconnect();
        }
        
        return articleList;
    }
}
