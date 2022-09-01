package metots.login;

public class Login {
	
	//Aşağıdaki login metodu prosedürel birlikteliğe sahiptir.
	// Birden fazla işi sırayla yapıyor.
	
	public void login(String tckn, String password)
			throws NoSuchCustomerException, CustomerLockedException, CustomerAlreadyLoggedException, WrongCustomerCredentialsException,
			MaxNumberOfFailedLoggingAttemptExceededException, ImproperCustomerCredentialsException, NoProperPasswordException {
		// First validate parameters
		validateTckn(tckn);
		validatePassword(password);

		// Now retrieve the customer from the db
		Customer customer = customerDao.retrieveCustomer(tckn);

		// If passwords match, customer hasn't already been locked nor logged in
		// Customer loggs in and it is now the currentCustomer
		if (customer.getPassword().equals(password) & !customer.isLocked() & !customer.isLoggedIn()) {
			customer.setLoggedIn(true);
			// customer.logsin is a property in atm.properties. If it is "yes"
			// database is updated when
			// a customer logs in. Updated part in db is CUSTOMERS.LOGGEDIN
			if (ATMProperties.getProperty("customer.logsin").equals("yes")) {
				logger.info(customer.getFirstName() + " " + customer.getLastName() + " logs in.");
				customerDao.updateCustomer(customer);
			}
			currentCustomer = customer;
		} else if (customer.isLoggedIn()) {
			throw new CustomerAlreadyLoggedException("Customer is already logged in. Please first log out.");
		} else if (customer.isLocked()) {
			throw new CustomerLockedException("Customer is locked. Please consult your admin.");
		} else if (!customer.getPassword().equals(password)) {
			loginAttemptCount++;
			if (loginAttemptCount == Integer.parseInt(ATMProperties.getProperty("customer.maxFailedLoginAttempt"))) {
				customer.setLocked(true);
				customerDao.updateCustomer(customer);
				loginAttemptCount = 0;
				throw new MaxNumberOfFailedLoggingAttemptExceededException("Max number of login attempt reached: " + loginAttemptCount);
			}
			else
				throw new WrongCustomerCredentialsException("TCKN/password is wrong.");
		}
	}
}
