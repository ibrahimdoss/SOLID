package CustomerExample;

public interface CustomerService {
	
	void createCustomer(Customer)
	Customer retieveCustomer(String) throws NoSuchCustomerException
	Customer refreshCustomer(Customer) throws NoSuchCustomerException;
	void login(String, String) throws NoSuchCustomerException, CustomerLockedException,
	CustomerAlreadyLoggedException, WrongCustomerCredentialsException,
	MaxNumberOfFailedLoggingAttemptExceededException,
	ImproperCustomerCredentialsException, NoProperPasswordException;
	Customer getCurrentCustomer();
	boolean logout(Customer)
	boolean lockCustomer(Customer)
	Account getDefaultAccount(Customer)
	boolean changePassword(Customer, String) throws NoProperPasswordException;
	void validatePassword(String) throws NoProperPasswordException;
	void validateTckn(String) throws ImproperCustomerCredentialsException;
}
