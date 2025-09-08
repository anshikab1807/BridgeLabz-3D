package AccessModifier;

public class BankAccounts {
	 public int accountNumber;
	    protected String accountHolder;
	    private double balance;

	    BankAccounts(int accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

	    public void displayAccountDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	    }
}
