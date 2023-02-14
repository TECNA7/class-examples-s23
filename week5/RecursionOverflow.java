public class RecursionOverflow {

  public static void hello() {
    hello();
    System.out.println("hello");
  }

  public static void main(String[] args) {
    hello();

  }

}
