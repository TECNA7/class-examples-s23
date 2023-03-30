public class BmcBank {

  private BankAccount[] accounts;

  public BmcBank(int size) {
    this.accounts = new BankAccount[size];
  }

  public static void main() {
    BmcBank bank = new BmcBank(5);

    bank[0] = new BankAccount(); // add name and balance
    bank[1] = new BankAccount();
    bank[2] = new BankAccount();
    bank[3] = new BankAccount();
    bank[4] = new BankAccount();

    // does "Adam" have an account with the bank?
    
    // how about "shdsdj"?

    // whats the average amount of money in an account?
    // who has the most amount of money?
    // who has the least amount of money?
  }

}
