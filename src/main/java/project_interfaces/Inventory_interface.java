package project_interfaces;


public interface Inventory_interface {
    void addArticle(Article_interface article);
    void delArticle(int id);
    void searchArticle(int id);
    void listArticles();
}
