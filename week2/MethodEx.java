// Adam P.
// 01/26/23
// lecture 04 demo - example using methods

import java.util.Scanner;

public class MethodEx {

  /**
  Asks user for a number and prints the 
  rounded squared root of the number
  
  @return void
  */
  public static void roundedSqrt() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Give me a number");
     double num2 = sc.nextDouble();
     double num2Sqr = Math.sqrt(num2);
     System.out.println(Math.round(num2Sqr));
  }

  public static void main(String[] args) {
    roundedSqrt();
    roundedSqrt();
    roundedSqrt();
    roundedSqrt();
    roundedSqrt();
    roundedSqrt();
    roundedSqrt();
    roundedSqrt();
  }
}
