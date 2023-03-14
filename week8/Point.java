public class Point {

  // what data should it have?
  // x
  // y
  // name
  int x;
  int y;
  String name;

  public Point() { // empty constructor
    x = 0;
    y = 0;
    name = "";
  }

  public int getX() {
    return x;
  }

  public static void main(String[] args) {
    Point p = new Point();
    System.out.println("Point p's x value is: " + p.getX());
  }

}
