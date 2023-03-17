//Adam Poliak
// 03/16/23
// Example splitting a string, helpful for HW06

public class HW {

  public static void main(String[] args) {
    String favQuote = "to be or not be?";

    // algorithm:
    // input: a string that contains words
    // output: a list that contains all ofthose words

   /*
    1. create an empty list
    2. initalize a new empty word
    3. repeat for every letter in our string:
      2a. if the letter is not a whitespace character:
          concatete the letter to our current word
      2b. otherwise:
          put the current word into our array
           re-initialize the current word, i.e. make it empty again
    4. add the current to our list
   */
   String[] words = favQuote.split();


   String word = new String("word");
   String word2 = new String();
  }

}
