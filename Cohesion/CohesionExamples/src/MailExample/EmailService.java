package MailExample;

public class EmailService {
	EmailGateway gateway;
	Printer[] printers;
	EmailRepository emailRepository;
	PersonnelService personnelService;
	EncryptionEngine encryptionEngine;
	EmailValidator emailValidator;
	EmailAddressValidator emailAddressValidator;
	EmailServer[] emailServers;
	�
	Email create(String text, String subject, Property[] properties){�}
	void send(Email email, EmailAddress addr){�}
	void send(Email email, EmailAddress[] addrs){�}
	void reply(Email originalEmail, Email newEmail){�}
	void forward(Email originalEmail, EmailAddress addr){�}
	void save(Email email){�}
	void print(Email email){�}
	void print(Email email, Printer printer){�}
	EmailAddress getEmailAddress(Person person){�}
	Email[] getEmails(Person person){�}
	void encrypt(Email email){�}
	Email decrypt(Email email){�}
	void validate(Email email){�}
	void validate(EmailAddress addr){�}
	void startEmailServer(EmailServer server);
	void stopEmailServer(EmailServer server);
	void configureEmailServer(EmailServer server);
}
