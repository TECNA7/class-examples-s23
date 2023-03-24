public class Dog extends Animal {

  public Dog() {
    weight = 0.;
    name = "";
    location = new double[2];    
    // the above is the same as running super()
  }

  public Dog(double weight, String name, double lat, double lon) {
    //Animal(weight, name, lat, lon); // create an animal, but we want a dop
    super(weight, name, lat, lon);
  }

  public void move(double lat, double lon) {
    //this.location[0] = lat;
    //this.location[1] = lon;
    super.move(lat, lon);
    System.out.println("I ran");
  }

  public static void main(String[] args) {
    Dog fluffy = new Dog();

    System.out.println(fluffy);
    Dog scooby = new Dog(70., "scooby dooby do", 90, 90);
    System.out.println(scooby);

    scooby.move(90, 0);

  }

}
