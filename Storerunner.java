import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    //Creates Snack objects
    Snack snack1 = new Snack();
    Snack snack2 = new Snack("Granola Bar", 1.50, 10);
    Snack snack3 = new Snack("Pretzels", 2.25);

    //Creates Chips objects
    Chips chips1 = new Chips();
    Chips chips2 = new Chips("Doritos", 2.99, 5, "Nacho Cheese");
    Chips chips3 = new Chips("Lays", 2.49, "Original");

    //Creates Candy objects
    Candy candy1 = new Candy();
    Candy candy2 = new Candy("Skittles", 1.49, 8, "Fruity");
    Candy candy3 = new Candy("Hershey Bar", 1.25, "Chocolate");

    //Creates Nuts objects
    Nuts nuts1 = new Nuts();
    Nuts nuts2 = new Nuts("Planters Peanuts", 3.99, 6, true);
    Nuts nuts3 = new Nuts("Cashews", 4.99, false);

    System.out.println("Snacks");
    System.out.println(snack1);
    System.out.println(snack2);
    System.out.println(snack3);

    System.out.println("Chips");
    System.out.println(chips1);
    System.out.println(chips2);
    System.out.println(chips3);

    System.out.println("Candy");
    System.out.println(candy1);
    System.out.println(candy2);
    System.out.println(candy3);

    System.out.println("Nuts");
    System.out.println(nuts1);
    System.out.println(nuts2);
    System.out.println(nuts3);

    chips2.setPrice(3.49);
    chips2.setQuantity(10);
    chips2.setFlavor("Cool Ranch");

    System.out.println();
    System.out.println("Updated Chips");
    System.out.println(chips2);

    System.out.println();
    System.out.println("Candy name: " + candy2.getName());
    System.out.println("Candy price: $" + candy2.getPrice());
    System.out.println("Candy type: " + candy2.getType());
    
    
    // Closes the Scanner object
    input.close();
    
  }
}