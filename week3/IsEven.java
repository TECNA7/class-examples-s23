// Adam Poliak
// 02/02/23
// Method for determine if a number is even or not

public class IsEven {
  /**
  Determines if a number is even

  @ pparam num - the interegers that the methods gets
  @return true if number is even, false otherwise
  */
  public static boolean isEven(int num) {
    return num % 2 == 0;
  }

  public static void main(String[] args) { 

    System.out.println(isEven(10));
    System.out.println(isEven(9));
  }

}
