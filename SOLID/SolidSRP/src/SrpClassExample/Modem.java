package SrpClassExample;

public interface Modem {
	
//	Buradaki Modem interface'nin  iki sorumluluğu vardır.
//		Dolayısıyla modem interface bölünmeli ve ancak birden fazla interface'in gerçekleştirmesi
//		olarak ifadee edilmelidir.
//		
//	Bu durumda birden fazla rolü bir araya getirmesinden dolayı Modem'in birlikteliğinin 
//	düştüğünden bahsedebiliriz.
	
	//SRP'ye uygun şekilde nasıl ayarlayabiliriz dersek "modemsClass" 
	//görselindeki gibi düzenlememiz gerekir.
	
	
	public void dial(String pno);

	public void hangup();

	public void send(char c);

	public char recv();

}
