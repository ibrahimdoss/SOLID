package metots;

public class Constructors {
	
	
	
	
	public Email(long id, String userId, String emailAddress, MailType type,
			MailStatus status, String subject, boolean deliveryGuarranteed,
			Date creationTime, Date tryUntil){…}

	public Email(long id, String userId, String emailAddress, MailType type,
			MailStatus status, String subject, boolean deliveryGuarranteed,
			Date creationTime, Date tryUntil, boolean validationNeeded){…}
	
	
	//Örneğin yukarıdaki constructorlar daha az parametre alacak hale getirilebilir ve static factory
	//metotlarıyla değiştirilebilir.
	
	public static Email createNewUrgentDeliveryGuarranteedEmail(long id, String userId,
			String emailAddress, String subject, Date tryUntil) {...}
	
	public static Email createNewUrgentDeliveryGuarranteedToBeValidatedEmail(long id,
			String userId, String emailAddress, String subject, Date tryUntil) {...}
	

}
