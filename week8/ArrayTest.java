public class ArrayTest {

  public static void add1(int[] numbs, int index) {
    if (index == numbs.length) {
      return;
    }
    numbs[index]++;
    add1(numbs, index+1);
  }

  public static void main(String[] arg) {
    int[] numbs = {1, 2, 3, 4};

    for (int numb : numbs) {
      System.out.print(numb + " ");
    }
    System.out.println();

    add1(numbs, 0);
    System.out.println("Ran add1()");
    for (int numb : numbs) {
      System.out.print(numb + " ");
    }
    System.out.println();

  }

}
