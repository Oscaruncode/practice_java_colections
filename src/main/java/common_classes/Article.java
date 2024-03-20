package common_classes;
import project_interfaces.Article_interface;

public class Article implements Article_interface,Comparable<Article>{
    private int idArticle;
    private String name;
    private int amount;
    private double cost;

    public Article (int idArticle, String name, int amount, double cost){
        this.idArticle = idArticle;
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Article{" + "idArticle=" + idArticle + ", name=" + name + ", amount=" + amount + ", cost=" + cost + '}';
    }

      @Override
    public int compareTo(Article other) {
        // Compare by id
        return Integer.compare(this.idArticle, other.idArticle);
    }
}
