// Adam Poliak
// 04/04/2023
// Binary search recursive implementation

class BinarySearchInts {

  public static boolean binarySearchRec(int[] haystack, int needle, 
                                       int low, int high) {
    if (low > high) {
      System.out.println("Needle not found!, look elsewhere dude@");
      return false;
    }
    int mid =  (high - low) / 2 + low;
    System.out.print("low: " +  low + " high: " + high + " " + "mid: " + mid + " ");
    System.out.println("value of mid: " + haystack[mid]);
    if (haystack[mid] == needle)  {
      System.out.println("we found the needle in the haystack - PARTY!");
      return true;
    }

   if (haystack[mid] < needle) {
     return binarySearchRec(haystack, needle, mid+1, high);
   }
   // haystack[mid] > needle
    return binarySearchRec(haystack, needle, low, mid-1);
  }
  public static boolean binarySearch(int[] haystack, int needle) {
     return binarySearchRec(haystack, needle, 0, haystack.length - 1);
  }

  public static void main(String[] args) {

    int[] numbs = {17, 21, 32, 36, 45, 52, 60, 75, 81, 99};
    System.out.println(binarySearch(numbs, 99));
    System.out.println(binarySearch(numbs, 21));
    System.out.println(binarySearch(numbs, 22));
    //algorithm: input: haystack (ordered), needle (the thing we are looking for
     //find the midpoint
   //     otherwise:
   //       if the needle is higher than the value at midpoint:
   //         repeat algoirhtm but change the haystack to just the right half
   //      otherwise:
   //         repeat algoirhtm but change the haystack to just the left half
   //                 
  }


}
