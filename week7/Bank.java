// Adam Poliak
// 02/23/2023
// Implementing a bank

public class Bank {

   public static double totalAmount(double[] accounts) {
     return ArrayUtils.totalSum(accounts);
   }

  public static void main(String[] args) {

     if (args.length == 0) {
        System.out.println("Give me a command line arg, bye bye!");
        return;
     }
    // change this so that the commannd line argument specifies

    // the size of the array/bank
    int size = Integer.parseInt(args[0]);
 
    double[] accounts = new double[size];
    System.out.printf("The bank has %d accounts\n", accounts.length);

    ArrayUtils.printArray(accounts);

    // check the total mount
    System.out.printf("The total amount the bank has is %f\n", totalAmount(accounts));
    // find number of accounts in overdraft

   accounts[0] = 5;
   accounts[1] = 6;
   accounts[2] = 3;
   ArrayUtils.printArray(accounts);

   // build a bigger bank:
   // algorithm:
   // 1 create a new array (thstds bigger)
   // 2. copy over the elements from old brank to new bank 
   //    one at a time
   accounts = ArrayUtils.extendArray(accounts);
   ArrayUtils.printArray(accounts);
  }

}

