package com.mycompany.exercise_colections;
import java.util.Scanner;
import project_interfaces.Inventory_interface;
import inventory_diferents_colections.inventory_on_arrayList;
import common_classes.Article;
/**
 *
 * @author Oscar Fuentes
 */

public class Exercise_colections {
    
    
    
    public static void manage_Inventory(Inventory_interface inventory, Scanner scanner){
        boolean run_manage_inventory = true;
        
        while(run_manage_inventory){
        System.out.println("¿Qué acción desea realizar?");
        System.out.println("1. Adicionar artículo");
        System.out.println("2. Borrar artículo");
        System.out.println("3. Buscar artículo");
        System.out.println("4. Listar artículos");
        System.out.println("5. Terminar programa");
        System.out.print("Ingrese el número de la opción: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el ID del artículo: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Ingrese el nombre del artículo: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la cantidad del artículo: ");
                int cantidad = scanner.nextInt();
                System.out.print("Ingrese el costo del artículo: ");
                double costo = scanner.nextDouble();
                inventory.addArticle(new Article(id, nombre, cantidad, costo));
                break;
            case 2:
                System.out.print("Ingrese el ID del artículo a borrar: ");
                int idBorrar = scanner.nextInt();
                inventory.delArticle(idBorrar);
                break;
            case 3:
                System.out.print("Ingrese el ID del artículo a buscar: ");
                int idBuscar = scanner.nextInt();
                inventory.searchArticle(idBuscar);
                break;
            case 4:
                inventory.listArticles();
                break;
            case 5:
                run_manage_inventory=false;
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option_colecction;
        
        System.out.println("Escoja el tipo de colección con el que quiere trabajar su inventario:");
        System.out.println("1. ArrayList");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.print("Ingrese el número de la opción: ");
      
        option_colecction=scanner.nextInt();
        
        switch(option_colecction){
            case 1:
                Inventory_interface inventory_on_ArrList = new inventory_on_arrayList();
                manage_Inventory(inventory_on_ArrList, scanner);
                break;
            case 2:
                Inventory_interface inventory_on_2 = new inventory_on_arrayList();
                 //Add loop for show inventory options
                manage_Inventory(inventory_on_2, scanner);
                break;
            case 3:
                 Inventory_interface inventory_on_3 = new inventory_on_arrayList();
                  //Add loop for show inventory options
                manage_Inventory(inventory_on_3, scanner);
                break;
            case 4:
                Inventory_interface inventory_on_4 = new inventory_on_arrayList();
                 //Add loop for show inventory options
                manage_Inventory(inventory_on_4, scanner);
                break;
            case 5:
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
        System.out.println("Programa finalizado");
    }
}
