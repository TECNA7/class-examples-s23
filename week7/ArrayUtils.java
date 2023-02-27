// Adam Poliak
// 02/28/2023
// Code from lec13
// utilities for working with arrays

public class ArrayUtils {

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

  public static void main(String[] args) {
    
    double[] numbs = {1,2,3,4};
    System.out.println(numbs);
    printArray(numbs); // this should print out 1 2 3 4 
  }

}
