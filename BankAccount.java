public class BankAccount {
  //Instance vars
  private double balance;
  private int accountID;
  private String password;

  //Constructor
  public BankAccount (int accountID, String password) {
    this.accountID = accountID;
    this.password = password;
    this.balance = 0.0;
  }

  //Methods
  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String newPass){
    password = newPass;
  }

  public boolean deposit(double amount){
    balance += Math.max(0, amount);
    return (amount >= 0);
  }

  public boolean withdraw(double amount){
    if (amount <= balance && amount >= 0){
      balance -= amount;
      return true;
    }
    return false;
  }

  public String toString(){
    return(accountID + "\t" + balance);
  }
}
