/* The Candy class represents candy sold in the store.*/
public class Candy extends Snack {

  //Stores the type of candy
  private String type;

  public Candy() {
    super();
    type = "Chocolate";
  }

  public Candy(String name, double price, int quantity, String type) {
    super(name, price, quantity);
    this.type = type;
  }

  public Candy(String name, double price, String type) {
    super(name, price);
  this.type = type;
  }

  //Returns the candy type
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String toString() {
    return super.toString() + ",Type: " + type;
  }
}