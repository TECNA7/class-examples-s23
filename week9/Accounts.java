import java.util.Scanner;

public class Accounts {


  public static void main(String[] args) {
    // ask a user for a number of accounts
    // then as a user for that many names
    // and create an account for each name

   BankAccount a = new BankAccount("my account", 1000);
   a.balance =- 100;
   System.out.println(a.getBalance());

   System.out.println("Tell me how many accounts you want");
   Scanner sc = new Scanner(System.in);

   int numAccounts = sc.nextInt();
   System.out.println(numAccounts);

   BankAccount[] accounts = new BankAccount[numAccounts];
   for (int i = 0; i < numAccounts; i++) {
     System.out.println("Give me a name for account" +  i+1);
     String name = sc.nextLine();
     accounts[i] = new BankAccount(name, 100);
   }

   for (int i = 0; i < accounts.length; i++) {
     System.out.println(accounts[i]);

   }

  }

}
