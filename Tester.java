public class Tester {
  public static void main (String[] args) {
    BankAccount account1 = new BankAccount(219657145, "testPassword1");
    BankAccount account2 = new BankAccount(123456789, "testPassword2");
    System.out.println(account1.getBalance());
    System.out.println(account1.getAccountID());
    System.out.println(account2.getBalance());
    System.out.println(account2.getAccountID());
    System.out.println(account1.deposit(987.65));
    System.out.println(account1.getBalance());
    System.out.println(account1.deposit(0));
    System.out.println(account1.getBalance());
    System.out.println(account1.deposit(-246.80));
    System.out.println(account1.getBalance());
  }
}
