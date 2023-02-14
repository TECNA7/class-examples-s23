public class SumInputRecursion {


  //basecase is when we reach the end of the list
  public static int sumArray(String[] list, int index) {
  
    // base case: 
    if (index == list.length - 1) {
      return Integer.parseInt(list[index]);
   }
  // rule
  return Integer.parseInt(list[index]) + sumArray(list, index+1);

  }

  public static int sumArray(String[]  list) {
    return sumArray(list, 0);
  }

  public static void main(String[] args) {

    // validate input
    // by ensusring that the user pputs in 3 values

    System.out.println(sumArray(args));

    // sum these three numbers

   // TODO: conver these 3 values to doubles or integers and then print their sum
  }

}
