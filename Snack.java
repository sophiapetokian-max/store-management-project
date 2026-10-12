/*The Snack class is the superclass for all snacks.*/
public class Snack {

  //Variables shared by all snacks
  private String name;
  private double price;
  private int quantity;

  public Snack() {
    name = "Unknown Snack";
    price = 0.0;
    quantity = 0;
  }

  public Snack(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Snack(String name, double price) {
    this.name = name;
    this.price = price;
    this.quantity = 1;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  //Returns information about the snack
  public String toString() {
    return "Name:" + name + ", Price: $" + price + ", Quantity: " + quantity;
  }
}