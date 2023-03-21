// Adam Poliak
// 03/21/2023
// A class to represent a Bank Account

public class BankAccount {

  public String name; 
  public double balance;

  //empty constructor 
  public BankAccount() {
     name = "";
     balance = 1.0;
  }

  // new constructor
  public BankAccount(String newName, double startBalance) {
     // in demo, change the name of the parameters to be name and balance
     name = newName;
     balance = startBalance;
  }
 
 
  //accessors/getters
  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  // mutators/setters
  // a method to assign a value to the account's name
  public void setName(String accountName) {
    // what the heck? what name should I give to it? -- thats the job 
    // of the parameter.
    name = accountName;
  } 

  public String toString() {
    return name + " has " + balance + " in their account";
  }


  // depoist money
  // withdraw money
  public double deposit(double moreMoney) {
    balance += moreMoney;
    return balance; //todo for adam: ranem balance to balance;
  }


  /**
  one sentence description

  @param how muhc money to withdraw
  @retrun the new updated balance after the withdrawal

  */
  public double withdraw(double amountToWithdraw) {
    balance -= amountToWithdraw;
    return balance;
  }

  public static void main(String[] args) {
    BankAccount emptyAccount = new BankAccount();
    System.out.println(emptyAccount);
    emptyAccount.setName("MySlushFund");
    System.out.println(emptyAccount);

    emptyAccount.deposit(1000);
    emptyAccount.withdraw(10);


    BankAccount tuitionAccount = new BankAccount("tuition", 60000.0);
  }

}












