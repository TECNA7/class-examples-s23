// Name: Adam Poliak
// Date: 01/24/23
// String concatenation

public class StringVariables {

  public static void main(String[] args) {

    String firstString = "calcium";
    String secondString = "green";

    // operators
    // try multiplying: 
    //ask class, what does it mean to multiply strings?
    // System.out.println(firstString * secondString);
    // we cant multiply strings
    
    // addition: 
    // ask class, what does it mean to add strings?
    System.out.println(firstString + " " +  secondString);

    // ask class: how can we store the result of adding two string
    String combinedString = firstString + " "+ secondString;
    System.out.println("The value in combinedString is: " + combinedString);

    // ask class: what about adding a number to a string
    // what will happen
    System.out.println(firstString + 5);
    //int newValue = firstString + 5;
    String newValue = firstString + 5;



   /* there are more operations we can apply to Strings
      (they are listed here: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
      but we will cover them in a few weeks time
   */
   // back to slides
   String blah = 5.5 + "32.6"; // + 5.5;
   //String blah = "32.6" + 5.5;
   System.out.println(blah);

   int numberNow = 5;
   String stringNumber = "32.6";

   // sometimes, the operands determine which operation 
   // is being performed
   System.out.println(stringNumber + numberNow); // this is concatenation

   // we didnt do the rest in class, dont worry about it
   // converting Integers to strings
   // converting Strings to Integers
   // converting Strings to Double

  }

}
