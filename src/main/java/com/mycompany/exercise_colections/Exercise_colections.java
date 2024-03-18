package com.mycompany.exercise_colections;
import java.util.Scanner;
import project_interfaces.Inventory_interface;
import inventory_diferents_colections.inventory_on_arrayList;
/**
 *
 * @author Oscar Fuentes
 */

public class Exercise_colections {
    
    public static void manage_Inventory(Inventory_interface inventory){
      
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option_colecction;
        
        System.out.println("Escoja el tipo de colección con el que quiere trabajar su inventario:");
        System.out.println("1. ArrayList");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.print("Ingrese el número de la opción: ");
      
        option_colecction=scanner.nextInt();
        
        switch(option_colecction){
            case 1:
                Inventory_interface inventory_on_ArrList = new inventory_on_arrayList();
                manage_Inventory(inventory_on_ArrList);
                break;
            case 2:
                Inventory_interface inventory_on_2 = new inventory_on_arrayList();
                manage_Inventory(inventory_on_2);
                break;
            case 3:
                 Inventory_interface inventory_on_3 = new inventory_on_arrayList();
                manage_Inventory(inventory_on_3);
                break;
            case 4:
                Inventory_interface inventory_on_4 = new inventory_on_arrayList();
                manage_Inventory(inventory_on_4);
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
        System.out.println("Programa finalizado");
    }
}
