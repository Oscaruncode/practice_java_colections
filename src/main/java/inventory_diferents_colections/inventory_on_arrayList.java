package inventory_diferents_colections;

import java.util.ArrayList;
import common_classes.Article;
import project_interfaces.Inventory_interface;
import project_interfaces.Article_interface;

public class inventory_on_arrayList implements Inventory_interface{
   private ArrayList<Article> inventory;
   
    public void addArticle(Article_interface article){System.out.println("Added");};
    public void delArticle(int id){ System.out.println("Deleted");};
    public void searchArticle(int id){System.out.println("Finded");};
    public void listArticles(){System.out.println("Listed");};
    
    
}
