public class Tester {
  public static void main (String[] args) {
    BankAccount account1 = new BankAccount(219657145, "testPassword1");
    BankAccount account2 = new BankAccount(123456789, "bestPass");
    System.out.println(account1.getBalance());
    System.out.println(account1.getAccountID());
    System.out.println(account1);
    System.out.println(account1.deposit(987.65));
    System.out.println(account1.getBalance());
    System.out.println(account1);
    System.out.println(account1.deposit(0));
    System.out.println(account1.getBalance());
    System.out.println(account1);
    System.out.println(account1.deposit(-246.80));
    System.out.println(account1.getBalance());
    System.out.println(account1);
    System.out.println(account1.withdraw(5555.55));
    System.out.println(account1.getBalance());
    System.out.println(account1);
    System.out.println(account1.withdraw(876.53));
    System.out.println(account1.getBalance());
    System.out.println(account1);
    System.out.println(account1.withdraw(111.12));
    System.out.println(account1.getBalance());
    System.out.println(account1);
    System.out.println(account1.withdraw(0));
    System.out.println(account1.getBalance());
    System.out.println(account1);
    System.out.println(account1.withdraw(-898.78));
    System.out.println(account1.getBalance());
    System.out.println(account1);

    System.out.println(account1.deposit(888888));
    System.out.println(account1.transferTo(account2, 111111, "notPassword"));
    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account1.transferTo(account2, 111111, "testPassword1"));
    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account1.transferTo(account2, -111111, "testPassword1"));
    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account2.transferTo(account1, 0, "bestPass"));
    System.out.println(account1);
    System.out.println(account2);
  }
}

/*
Expected:
0.0
219657145
#219657145      $0.0
true
987.65
#219657145      $987.65
true
987.65
#219657145      $987.65
false
987.65
#219657145      $987.65
false
987.65
#219657145      $987.65
true
111.12
#219657145      $111.12
true
0.0
#219657145      $0.0
true
0.0
#219657145      $0.0
false
0.0
#219657145      $0.0
true
false
#219657145      $888888.0
#123456789      $0.0
true
#219657145      $777777.0
#123456789      $111111.0
false
#219657145      $777777.0
#123456789      $111111.0
true
#219657145      $777777.0
#123456789      $111111.0
*/
