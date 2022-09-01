package metots.login;

public enum LoginResult {

//	Gelinen noktada, ilk halde bir tek metodun içinde yer alan bloklar, tekrar kullanılabilecek 
//	şekilde metotlara dönüşmüş durumdadır.
//	
//	Böylece işçi metotlar sadece bir şey yapar hale gelmiştir.
//	
//	Orijinal login (String username, String password) metodu ise yönetsel metottur, diğer metotları
//	çağırarak login sürecini yönetmektedir.
	
//	Login (String username, String password) metodu en üstteki, Facade nesnesindeki yönetici metottur.
//	
//	Çağırdığı metotlardan login(Customer customer, String pasword) metodu ise Servis nesnesinde 
//	daha aşağı seviyedeki bir yönetsel metottur.
//	
//	Ama hepsi iş mantığını içeren iş metotlardır.
}
