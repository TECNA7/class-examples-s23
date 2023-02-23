// Adam Poliak
// 02/23/2023
// Code from lec12
// more loops, including nested loop

public class Lec12 {

  /** 
    Print out the contents of a list
    @param - haystack (an array of integers)
    @return - zilch! - void for those who speak java
 */
    //int[] numbs = {1,2,3,4};
    //System.out.println(numbs);
    //printArray(numbs); // this should print out 1 2 3 4 
  public static void printArray(double[] haystack) {
    for (int i = 0; i < haystack.length; i++) { 
      // print out the value of our array at index i
      System.out.print(haystack[i] + " ");
    }
    System.out.println();
  }

  /**
    Print out a square of stars
    
    @param - the size of the square
    @return - nada! 
  */
  public static void square(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    
    square(4);
    // f(x) = x*x; // implement the method
    //f(2) = 4; // calling the method 
    double[] numbs = {1,2,3,4};
    System.out.println(numbs);
    printArray(numbs); // this should print out 1 2 3 4 


    //char[] chars = {'1','2','3','4'};
    //printArray(chars);
    //String[] chars = {"1","2","3","4"};
    //System.out.println(chars);
  }

}
