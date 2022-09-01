package metots.account;

public class AccountService {
	
	//AccountService üzerindeki metotlar yönetsel bir metottur, değer kontrolü(validation)
	//ve Account nesnesi ile ilgili atomik işleri bir arada yerine getirmektedir.
	
	
	private static final double EFT_CHARGE = 3;
	private AmountValidator validator = new AmountValidator();

	public void withdraw(Account account, double amount) throws InsufficentBalanceException, NegativeAmountException {
		validator.validate(amount);
		account.withdraw(amount);
	}

	public void deposit(Account account, double amount) throws InsufficentBalanceException, NegativeAmountException {
		validator.validate(amount);
		account.deposit(amount);
	}
	
	public void eft(Account sourceAccount, Account targetAccount, double amount) throws InsufficentBalanceException, NegativeAmountException {
		validator.validate(amount);
		sourceAccount.withdraw(amount);
		sourceAccount.withdraw(EFT_CHARGE);
		targetAccount.deposit(amount);
	}
}
