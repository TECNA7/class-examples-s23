public class RangeValue {

  public static int randNum(int min, int max) {

    // choose random between 0 and 1
    // multipy by the min
    // add the range
    double rand = Math.random();
    int range = max - min;
    return Math.ceil(rand * range) + min;

  }

  public static void main(String[] args) {
    System.out.println(randNum(2, 21));
    System.out.println(randNum(2, 21));
    System.out.println(randNum(2, 21));
    System.out.println(randNum(2, 21));

  }

}
