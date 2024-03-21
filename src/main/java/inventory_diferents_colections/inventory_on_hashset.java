package inventory_diferents_colections;
import java.util.HashSet;
import java.util.Iterator;
import common_classes.Article;
import project_interfaces.Inventory_interface;

public class inventory_on_hashset implements Inventory_interface{
    private HashSet<Article> inventory;

    public inventory_on_hashset() {
        inventory = new HashSet<>();
    }

    @Override
    public void addArticle(Article article) {
        inventory.add(article);
        System.out.println("Artículo " + article.getName() + " agregado");
    }

    @Override
    public void delArticle(int id) {
        Iterator<Article> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Article article = iterator.next();
            if (article.getIdArticle() == id) {
                iterator.remove();
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


