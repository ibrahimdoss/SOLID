package resolveOcpExample;

public class WithDraw implements AccountAction{
	
	@Override
	public double act(double balance, double amount) throws InsufficentBalanceException {
		if (balance >= amount)
			balance -= amount;
		else
			throw new InsufficentBalanceException(balance, amount);
		
		return balance;
	}
}
