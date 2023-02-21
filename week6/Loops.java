// Adam Poliak
// 02/21
// Loops from lecture 11

import java.util.Scanner;

public class Loops {
   public static int getNumber() {
     System.out.println("give me a numnber:" );
     Scanner sc = new Scanner(System.in);
     while (!sc.hasNextInt()) {
       System.out.println("Fool, thats not an integer. give me one now");
       // how to prevent an infinte loop
      return getNumber();
     }
     int number = sc.nextInt();
     return number;
  }

  public static int loopOw2(int x) {
   // when do we want to stop multiply 2's together?
   //after we've done it x times
   int count = 0; // sometimes we'll use the variable named i
   int product = 1;
   while (count < x) {
     product *= 2; // this is a fancy way of sdoing product = product * 2
     count += 1; // this is fancy for count = count + 1
   }
    return product;
  }


  public static void loopPattern(int length) {
    // print out *_*_* pattern
    for (int i = 0; i < length; i++) {
      // lets print a star or an underscore
      if (i % 2 == 0) {
        System.out.print("*");
      } else {
        System.out.print("_");
      }
    }
    System.out.println();
  }
 
  public static void main(String[] args) {
    // test the method
    // System.out.println(getNumber());

   // stop condition after asking the user for
   // a number 6 times
   /*
   int count = 0;
   int sum = 0;
   while (count < 6) {
      sum = sum + getNumber();
      count = count + 1;
      System.out.println(count);
   } 
   System.out.printf("The sum is: %d\n", sum);
   */ 
   System.out.println(getNumber());
   System.out.println(loopOw2(1) == 2); 
   System.out.println(loopOw2(2) == 4); 
   System.out.println(loopOw2(3) == 8); 
   System.out.println(loopOw2(6) ==64); 
   System.out.println(loopOw2(0) ==1); 

   loopPattern(3);
   loopPattern(10);
}
}
