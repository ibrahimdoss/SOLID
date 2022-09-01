package metots;

public class YonetselMethod {

	
//	Aşağıdaki changeBalance() metodu ne atomik ne de süreçsel(yönetsel) bir metottur, birden fazla 
//	atomik işi bir arada yapmaktadır.
	
	public void changeBalance(String action, double amount)
			throws InsufficentBalanceException, NegativeAmountException{
		if(amount < 0)
			throw new NegativeAmountException(amount);
		
		if (action.equals("Deposit"))
			balance += amount;
		else if (action.equals("Withdraw")) {
			if (balance => amount)
				balance -= amount;
			
			else 
				throw new InsufficentBalanceException(action, balance, amount);
				
			}
		log.info(action + " : " + amount + " for account id:" + id);
			
		}
	}
}
