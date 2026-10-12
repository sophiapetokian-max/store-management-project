/* The Chips class represents chips sold in the store.*/
public class Chips extends Snack {

  //Stores the flavor of the chips
  private String flavor;

  public Chips() {
    super();
    flavor = "Original";
  }

  public Chips(String name, double price, int quantity, String flavor) {
    super(name, price, quantity);
    this.flavor = flavor;
  }

  public Chips(String name, double price, String flavor) {
    super(name, price);
    this.flavor = flavor;
  }

  //Returns the chip flavor
  public String getFlavor() {
 return flavor;
  }
  
public void setFlavor(String flavor) {
  this.flavor = flavor;
}
  
  public String toString() {
    return super.toString() + ", Flavor: " + flavor;
  }
}