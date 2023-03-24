public class Zoo {

  public static void main(String[] args) {
    Dog snoopy = new Dog(5, "snoopy", -90, 0);
    Dog clifford = new Dog(2000, "clifford", -90,1);
    Animal squirrel = new Animal(40, "mutant Squrrel", 0, 0);
    Turtle turt = new Turtle(3, "mike", 34, 34);

    System.out.println(turt);

   Animal[] zoo = new Animal[10];
   zoo[0] = turt;
   zoo[1] = snoopy;

  " ".length();
  for (int i = 0; i < zoo.length; i++) {
    System.out.println(zoo[i]);
  }
   System.out.println(zoo);
  }

}
