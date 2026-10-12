/* The Nuts class represents nuts sold in the store.*/
public class Nuts extends Snack {

  //Stores whether the nuts are roasted
  private boolean roasted;

  public Nuts() {
    super();
    roasted = false;
  }

  public Nuts(String name, double price, int quantity, boolean roasted) {
    super(name, price, quantity);
    this.roasted = roasted;
  }

  public Nuts(String name, double price, boolean roasted) {
    super(name, price);
    this.roasted = roasted;
  }

  //Returns whether the nuts are roasted
  public boolean getRoasted() {
    return roasted;
  }

  public void setRoasted(boolean roasted) {
    this.roasted = roasted;
  }

  public String toString() {
    return super.toString() + ", Roasted: " + roasted;
  }
}