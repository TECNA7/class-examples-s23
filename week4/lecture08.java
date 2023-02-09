// Adam Poliak
// 02/09/23
// String and array examples

public class lecture08 {
  public static void main(String[] args) {
    String one = "a";
    String two = "b";

   // does this print out a positive or negative value? 
   System.out.println(one.compareTo(two));
   // does this print out a positive or negative value? 
   System.out.println(two.compareTo(one));

   // why is the value printed out here different than the value
   // printed in line 11
   System.out.println(one.compareTo("c"));

   char cChar = 'c';
   // System.out.println(one.compareTo('c'));
   // this doesnt work, why? because we cant use compareTo to 
   // compare strings to characters

    // create new arrays
    double val = 10.0;
    double[] vals = {77.0, 4.8, 2.3, 6.4};
    String name = "derek";
    String[] names = {"adam", "dereck", "john", "derick"};

   String p1 = "adam";
   String p2 = "dereck";
   String p3 = "lola";
   String p4 = "emily";

   String[] aInCS113  = {p2, p3, p4}; // initialize with value

   int[] numbers = new int[3];
   System.out.println(numbers);

   System.out.println(numbers[0]);

   String[] words = new String[3];
   System.out.println(words[0]);
   System.out.println("".length()); // this is an empty string
   // what error does this cause?
   System.out.println(words[0].length());

   // What error does this cause?
   System.out.println(words[3]);
  }

}
