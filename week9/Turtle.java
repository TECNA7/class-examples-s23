public class Turtle extends Animal {


  public Turtle(double weight, String name, double lat, double lon) {
    super(weight, name, lat, lon); 
  }

  public void move(double lat, double lon) {
    super.move(lat, lon);
    System.out.println("I slowly crawled, look ma, arent you proud!");
  }
}
