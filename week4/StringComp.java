import java.util.Scanner;

public class StringComp {

  public static void main(String[] args) {
    System.out.println(2 > 10);
    System.out.println("hello" == "hello");
    String message = "hello";
    String message2 = "hello";
    //String message2 = new String("hello");
 
   System.out.println(message);
   System.out.println(message2);
   System.out.println("Are they the same object ");
   System.out.println(message == message2); // this doesnt check if the values in the variables are the same

   //System.out.println(message.compareTo(message2));
   //Scanner sc = new Scanner(System.in);
   //System.out.println(sc);

   //System.out.println(args);
  }

}
