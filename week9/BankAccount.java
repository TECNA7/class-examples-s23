// Adam Poliak
// 03/21/2023
// A class to represent a Bank Account

public class BankAccount {

  public String name; 
  private double balance;

  //empty constructor 
  public BankAccount() {
     name = "";
     balance = 1.0;
  }

  // value constructor
  public BankAccount(String name, double balance) {
    this.name = name;
    this.balance = balance;


     //name = newName;
     //balance = startBalance;
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

  //transfering
  // account rransfering from
  // account transfering to
  //amount transfering
  public static boolean transfer(BankAccount sender,
                          BankAccount recipient, 
                          double amount) {
    return sender.transferTo(recipient, amount);
  }

  //transferTo
  public boolean transferTo(BankAccount recipient, double amount) {
    // subtract from the balance
    if (amount > balance) {
      System.out.printf("%f is too much money to trsansfer\n", amount);
      return false;
    } 
    balance -= amount;
    //add money to thje recepient
    recipient.deposit(amount); // depost the money into the receipient
    return true;
  }

  public static void main(String[] args) {
    BankAccount emptyAccount = new BankAccount();
    System.out.println(emptyAccount);
    emptyAccount.setName("MySlushFund");
    System.out.println(emptyAccount);

    emptyAccount.deposit(1000);
    emptyAccount.withdraw(10);

    BankAccount tuitionAccount = new BankAccount("tuition", 60000.0);
    System.out.println("This is the account for tuition");
    System.out.println(tuitionAccount);

   System.out.println("Transfering money 1");
   System.out.println(emptyAccount);
   System.out.println(emptyAccount.transferTo(tuitionAccount, 10));
   System.out.println(emptyAccount);

   System.out.println("Transfering money 2");
   System.out.println(tuitionAccount);
   System.out.println(tuitionAccount.transferTo(emptyAccount, 10));
   System.out.println(tuitionAccount);


   System.out.println("Transfering money 3");
   System.out.println(transfer(emptyAccount, tuitionAccount, 100000));
  }

}












