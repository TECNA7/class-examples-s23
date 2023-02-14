public class RecursionHello {

  public static void hello(int i) {
     // base case
     // when o we stop calling the method recursively or what is the smallest subproblem
     // when i is 0
     if (i == 0) {
       return;
     } 
     // rule, print hello and then call the method recursively
     System.out.println("hello");
     hello(i - 1);

  }

  public static void hello() {
    hello(5);
  }

  public static void main(String[] args) {
    hello();

  }

}
