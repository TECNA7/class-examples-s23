// Name: Adam Poliak
// Date: 01/24/23
// Example using the Scanner to read data
// from a user

// import java.lang; compiler has access to this already
import java.util.Scanner; // we are telling the compiler where
// to get the Scanner from. 

public class ReadingInput {

  public static void main(String[] args) {

     // ask a user to give us their age (int) and name
     System.out.println("Please enter your age and name");

     // use readline to read in the info
     //String input = System.console().readLine();
     // print readline
     //System.out.println(input);

 
     //method 2 below (go back to slides)
     Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();
     String name = sc.nextLine();
     System.out.println(name + " is " + age + " years old"); 

     // formatting Strings (Chapter 3.5)
     //System.out.printf("%s is %.2f years old", name, age);
     // solution is below
    /**
    System.out.println("Whats your name and age");
    String name1 = sc.nextLine();
    int age1 = sc.nextInt();
     System.out.println(name1 + " is " + age1 + " years old"); 
     */ 

     System.out.printf("%s is %.2f years old", name, (double) age);
     // What do we not like about the output above

     // if time remaining, ask user for name and then age (use scanner)

  }

}
