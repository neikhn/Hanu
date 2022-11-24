package asg_2101140043;

import java.util.*;

public class Feature extends Main{
  //[FEATURE 1]
  public static void addProduct(ArrayList<Product> list) {
    Scanner sc = new Scanner(System.in);
    String name;
    long price;
    long quantity;
    
    System.out.println("");
    System.out.print("Product name: ");
    name = sc.nextLine();
    System.out.print("Product price: ");
    price = sc.nextLong();
    System.out.print("Product quantity: ");
    quantity = sc.nextLong();

    for (int i = 0; i < list.size(); i++) {
      if ((name.equals(list.get(i).name))) {
        System.out.println("\n" + "This product already existed!");
        retryMenu2(list);
      } 
    }
    list.add(new Product(name, price, quantity));
    System.out.println("\n" + "Product added: " + "\"" + name + "\"");
    retryMenu2(list);
    sc.close();
  }
  //[FEATURE 2]
  public static void viewProduct(ArrayList<Product> list) {
    //if list contains no product
    if (list.size() < 1) {
      System.out.println("\n" + "Nothing found!");
      retryMenu2(list);
    }
    //list all products
    System.out.println("\n" +
        "+----------------------------------------------------------------------------+" + "\n" +
        "|                                PRODUCTS LIST                               |" + "\n" +
        "+----------------------------------------------------------------------------+" + "\n" +
        "| ID    | Name                 | Price                | Quantity             |");

    for (int i = 0; i < list.size(); i++) {
      (list.get(i)).information();
    }
    System.out.println(
        "+----------------------------------------------------------------------------+");
    retryMenu2(list);
  }
  //[FEATURE 3]
  public static void deleteProduct(ArrayList<Product> list) {
    //if list contains no product
    if (list.size() < 1) {
      System.out.println("\n" + "No existing product!");
      retryMenu2(list);
    }
    //remove product
    Scanner sc = new Scanner(System.in);
    System.out.print("\n" + "Enter the product ID: ");
    String id = sc.nextLine();
    for (int i = 0; i < list.size(); i++) {
      if ((list.get(i).getID()).equals(id)) {
        System.out.println("Product removed: " + list.get(i).getName());
        list.remove(i);
      }
      //this should be (i == (list.size() - 1)) 
      //since list.size() = the amount of index in list 
      else if (i == (list.size() - 1)) {
        System.out.println("Invalid ID!");
      }
    }
    retryMenu3(list);
    sc.close();
  }
  //[FEATURE 4]
  public static void editProduct(ArrayList<Product> list) {
    
  }
}
