package metots.account;

public class Account {

	private String iban;
	private double balance;
	
	public void withdraw(double amount) throws InsufficentBalanceException {
		if (balance >= amount) {
			balance -= amount;
		} else
			throw new InsufficentBalanceException(balance, amount);
	}

	public void deposit(double amount) throws InsufficentBalanceException {
		balance += amount;
	}
}
