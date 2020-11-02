class Account {
  private int id;
  private double balance;
  private static double annualInterestRate;
  private java.util.Date dateCreated;

  public Account() {
    dateCreated = new java.util.Date();
  }

  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setId(int newId) {
    id = newId;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public void deposit(double amount) {
    balance += amount;
  }
}

public class problem0907 {

	public static void main (String[] args) {
	    Account account = new Account(1122, 20000);
	    Account.setAnnualInterestRate(4.5);
	    
	    account.withdraw(2500);
	    account.deposit(3000);
	    System.out.println("您所查询的账户余额为：" + account.getBalance());
	    System.out.println("您所查询的账户月利息为：" +
	      account.getMonthlyInterest());
	    System.out.println("您所查询的账户开户日期为：" +
	      account.getDateCreated());
	  }
	}
