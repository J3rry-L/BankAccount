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

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String newPass){
    this.password = newPass;
  }

  public boolean deposit(double amount){
    this.balance += Math.max(0, amount);
    return (amount >= 0);
  }
}
