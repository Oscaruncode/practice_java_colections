package project_interfaces;
import common_classes.Article;

public interface Inventory_interface {
    void addArticle(Article article);
    void delArticle(int id);
    void searchArticle(int id);
    void listArticles();
}
