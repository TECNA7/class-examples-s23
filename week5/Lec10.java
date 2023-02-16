// Adam Poliak
// 02/16/23
// Recursive methods from lecture 10

public class Lec10 {

  
  public static int factorial(int n) {
    if (n - 1 == 0) {
      return 1;
    }
    return n * factorial(n-1);
  }

  /**
    Determine whether a needle is in a haystack
    @param haystack: string to be searching in
    @param needle: the character to search for
    @return boolean indicating if the needle has been found
  */
  public static boolean containsLetter(String haystack, char needle) {
     System.out.println(haystack);
     //base 
    if (haystack.length() == 0) {
      return false;
    }
    //rule
    char firstChar = haystack.charAt(0);
    if (needle == firstChar) {
      return true; 
    } 
      // check the next character
      // substring(int beginIndex)
      //Returns a new string that is a substring of this string.
    return containsLetter(haystack.substring(1) , needle);
  }

  public static void test(String haystack, char needle, boolean output ) {
    System.out.println(containsLetter(haystack, needle) == output);
  }

  public static void main(String[] args) {

    /*
    System.out.println(factorial(1) == 1);  // 1
    System.out.println(factorial(2)  == 2); // 2
    System.out.println(factorial(3) == 6); //6
    System.out.println(factorial(4) == 24);  //24
    System.out.println(factorial(5) == 120); //120
    */
    test("hay", 'a', true);
    test("hay", 'z', false);
    test("", 'z', false);


  }

} 
