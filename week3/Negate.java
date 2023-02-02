// Adam Poliak
// 01/31/23
// More method examples from class

public class Negate {

  public static double negate(double x) {
     
    double value = 12.0;
    return -1 * x;
  }

  public static void main(String[] args) {
    double value = 4.5;
    double x = negate(value);
    System.out.printf("%.2f", x); 

  }

}
