// name
// data
// description - happy now?


public class HappyKnowIt {


  public static void main(String[] args) { 
     boolean isHappy = true;
     boolean knowIt = true;
     boolean showIt = true; //false;

     /*
       if happy and know it: clap your hands

      if happy and know it and show It: clapp your hands
     */
     if (isHappy && knowIt && showIt) {
        System.out.println("Clap your hands 2");
     }
     else if (isHappy && knowIt) {
        System.out.println("Clap your hands 1");
     }
     else {
       System.out.println("next case");
     }

  }

}
