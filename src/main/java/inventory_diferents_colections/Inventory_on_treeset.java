package inventory_diferents_colections;
import java.util.TreeSet;
import common_classes.Article;
import project_interfaces.Inventory_interface;

public class Inventory_on_treeset implements Inventory_interface{
    private TreeSet<Article> inventory;

    public Inventory_on_treeset() {
        inventory = new TreeSet<>();
    }

    @Override
    public void addArticle(Article article) {
        inventory.add(article);
        System.out.println("Artículo " + article.getName() + " agregado");
    }

    @Override
    public void delArticle(int id) {
        for (Article article : inventory) {
            if (article.getIdArticle() == id) {
                inventory.remove(article);
                System.out.println("Artículo borrado correctamente.");
                return;
            }
        }
        System.out.println("Artículo no encontrado para borrar.");
    }

    @Override
    public void searchArticle(int id) {
        for (Article article : inventory) {
            if (article.getIdArticle() == id) {
                System.out.println("Artículo encontrado:");
                System.out.println(article);
                return;
            }
        }
        System.out.println("Artículo no encontrado.");
    }

    @Override
    public void listArticles() {
        System.out.println("Listado de Artículos:");
        for (Article article : inventory) {
            System.out.println(article);
        }
    }
}

