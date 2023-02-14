public class SumInteger {

  public static void main(String[] args) {

    // validate input
    // by ensusring that the user pputs in 3 values
    if (args.length != 3) {
       System.out.println("Better luck next time, give me 3 numbers");
       return;
    }
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);

    // sum these three numbers
    args[0] + args[1] + args[2]  // string concatenation here

   // TODO: conver these 3 values to doubles or integers and then print their sum
  }

}
