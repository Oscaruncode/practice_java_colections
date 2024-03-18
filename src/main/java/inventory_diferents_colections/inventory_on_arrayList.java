package inventory_diferents_colections;

import java.util.ArrayList;
import common_classes.Article;
import project_interfaces.Inventory_interface;

public class inventory_on_arrayList implements Inventory_interface{
   private ArrayList<Article> inventory;
   
   public inventory_on_arrayList() {
        inventory = new ArrayList<>(); // Inicialización del ArrayList
    }
   
   public void addArticle(Article article) {
        inventory.add(article);
        System.out.println("Artículo " + article.getName() + "Added");
    }
    public void delArticle(int id){ 
           for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getIdArticle()== id) {
                inventory.remove(i);
                System.out.println("Artículo borrado correctamente.");
            }
        System.out.println( "Deleted");};
    }
    public void searchArticle(int id){
        for (Article article : inventory) {
            if (article.getIdArticle() == id) {
                System.out.println("Artículo encontrado:");
                System.out.println(article);
            }};
    }
    public void listArticles(){
    System.out.println("Listado de Artículos:");
        for (Article article : inventory) {
            System.out.println(article);
        }
    }
}
