package ocpExample;

public enum AccountNotes {
	
	//TODO: account'un çözümü aynı zamanda Command kalıbı uygulamasıdır.
	
	
	
	
	/*
	 * changeBalance() metodu, kendisine geçilen String tipinde action verisinden
	 * dolayı değişime kapalı değildir.
	 * 
	 * Muhtemelen action bir başka sınıfın iç işleyişinin bir detayıdır.
	 * 
	 * Dolayısıyla sadece veri olarak bu metoda geçilmesi, içerik
	 * bağımlılığıdır(content coupling) ve birlikte değişme problemi oluşturur.
	 * 
	 * changeBalance() SRP olmadığı gibi OCP de değildir.
	 */
	
	
	//TODO RESOLVE
	/*
	 * Bunun yerine AccountAction tipinde nesne geçerek değişiklik ihtiyacı
	 * genişletmeyle karşılanabilir hale getirilebilir.
	 * 
	 * Veriye olan bağımlılık nesneye (veri+ davranış) döner ve soyut hale gelir.
	 * 
	 * changeBalance() metodu içindeki iş mantığı da farklı AccountAction
	 * nesnelerine dağıtılır ve yüksek birliktelikli olarak halledilir.
	 * 
	 * Bu şekilde changeBalance() metodunun birlikteliği artar ve OCP'ye uygun hale
	 * gelir.
	 */
}
