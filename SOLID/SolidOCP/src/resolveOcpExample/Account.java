package resolveOcpExample;

public class Account {
	
	private double balance;

	public void changeBalance(AccountAction action, double amount)
			throws InsufficentBalanceException, NegativeAmountException {
		if (amount < 0)
			throw new NegativeAmountException(amount);

		balance = action.act(balance, amount);
//		   log.info(action + " : " + amount + " for account id: " + id);
	}
}
