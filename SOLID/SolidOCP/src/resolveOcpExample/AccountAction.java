package resolveOcpExample;

public interface AccountAction {
	
	public double act(double balance, double amount) throws InsufficentBalanceException;

}
