public class Animal {

  protected double weight;
  protected String name;
  protected double[] location;
  
  public Animal() {
    weight = 0.;
    name = "";
    location = new double[2];
  }

  public Animal(double weight, String name, double lat, double lon) {
    this.weight = weight;
    this.name = name;
    this.location = new double[2];
    this.location[0] = lat;
    this.location[1] = lon;
  }

  public String toString() {
    return name + " ("+ weight+" lbs) is currently at: " + location[0] + "," + location[1]; 
  }  

  public void move(double newLat, double newLon) {
    this.location[0] = newLat;
    this.location[1] = newLon;
    System.out.println("I moved to " + this.location[0] +"," + this.location[1]);
  }
  
  public static void main(String[] args) {
    Animal emptyAnimal = new Animal();
    Animal favAnimal = new Animal(1, "splinter the rat", -39.7, 9);
    System.out.println(favAnimal);
    favAnimal.move(90, -1);
    System.out.println(favAnimal);

  }

}
