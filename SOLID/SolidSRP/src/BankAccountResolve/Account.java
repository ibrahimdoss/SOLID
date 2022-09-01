package BankAccountResolve;

import java.sql.Date;

public class Account implements Printer, Dao, TransactionService {

	@Override
	public void save(Persistable persistable) {
	}

	@Override
	public Persistable retrieve(int id) {
		return null;
	}

	@Override
	public void update(Persistable persistable) {	
	}

	@Override
	public void print(Printable printable) {
	}
	
	public Date getCreationDate(){}
	public double getBalance(){}
	public double getInterestRate(){}
	public Customer getOwner(){}
	public void deposit(double amount){}
	public void withdraw(double amount){}

}
