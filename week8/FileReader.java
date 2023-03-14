import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {


  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("file.txt"); // create a new File object named file based on the file called file.txt
    Scanner sc = new Scanner(file); // create a new Scanner object called sc that reads in data from the file
    String line = sc.nextLine(); // read the first line from the file and store it in a variable called line
    System.out.println(line);
  }

}
