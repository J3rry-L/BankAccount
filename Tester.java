public class Tester {
  public static void main (String[] args) {
    BankAccount account1 = new BankAccount(219657145, "testPassword");
    System.out.println(account1.getBalance());
    System.out.println(account1.getAccountID());
  }
}
