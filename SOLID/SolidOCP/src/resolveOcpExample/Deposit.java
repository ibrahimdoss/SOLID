package resolveOcpExample;

public class Deposit implements AccountAction{
	
	@Override
	public double act(double balance, double amount) {
		balance -= amount;
		return balance;
	}

}
