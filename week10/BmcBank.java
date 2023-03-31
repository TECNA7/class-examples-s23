// Adam Poliak
// 03/30/2023
// BmcBank class that has a list of accounts
// search examples from lecture 20

public class BmcBank {

  private BankAccount[] accounts;

  public BmcBank(int size) {
    this.accounts = new BankAccount[size];
  }

  public boolean contains(String needle) {
    int i = 0;
    while (i < this.accounts.length) {
      if (this.accounts[i] != null) {
        if (this.accounts[i].getName().equals(needle)) {
          return true;
        }
      }
      i++; // i = i + 1
    }
    return false;
  }

  public static void main(String[] args) {
    BmcBank bank = new BmcBank(6);

    bank.accounts[0] = new BankAccount("kCas", 500000); // add name and balance
    bank.accounts[1] = new BankAccount("Tim", 200000);
    bank.accounts[2] = new BankAccount("Arora", 10);
    bank.accounts[3] = new BankAccount("Adam", 0);
    bank.accounts[4] = new BankAccount("John", 99);

    // does "Adam" have an account with the bank?
    // algorithm to check if Adam has an account:
    // output: boolean: True if yes, otherwise False
    //  iterate through each account in our array:
    //    for a given account, check if the name is "Adam" 
    //       if thats the case: return true and stop searching
    //       if not true: continue searching
    //   if not foud, return false
    boolean found = bank.contains("Adam");
    System.out.println("Account found: " + found);
    found = bank.contains("Pete");
    System.out.println("Account found: " + found);



    // whats the average amount of money in an account?
    // who has the most amount of money?
    // algoirthm: input: list of accounts, output: the name of the account with the highest balance
    // assign something to the highest balance variable
    //   options are: 0, the first
   // iteratoe through our array of bank accounts
   // for every bank account BA in our list:
   //  get the balance of the account
   //  compare the balance to the the highest balance we've seen so far
   //  if current balance > biggest balance:
   //    then, update biggest balance to the current balance
   

    // who has the least amount of money?
  }

}
