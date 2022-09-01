package statement;

public enum StatementNotes {
	
	/*
	 * Yapılan tüm örnekler neticesinde SRP açısından temel kriteri anlaşılırlık
	 * olmakla birlikte yapısı
	 * 
	 * Kesinlikle tekrar içermeyecek,
	 * 
	 * Oncelik vb. faktörlere bağlı olarak anlaşılma problemine sebep olmayacak,
	 * 
	 * kopyalanarak dağıtılmadan sistemde sadece tek bir örneği olacak şekilde,
	 * 
	 * bağlamsal ve kültüreldir.
	 */
	
//	***Ama anlaşılırlığı azaltan ve yanlışa sevkeden, bağlam değişimi içeren, örneğin aynı satırda
//	farklı nesneler üzerindeki çağrıları zincirleyen ifadeler o kadar masum değildir.
	
	
	//example
	
	shoppingCard.getItemList().get(0).recommendedBy().size();
	
	// yukarıdaki kod yerine 
	
	List<Item> itemList = shoppingCard.getItemList().get(0);
	int recommendedBySize = itemList.recommendedBy().size();
	
	// Bu ve benzeri şekiller çok daha anlaşılırdır, muhtemel tekrar metot çağrılarını önler ve 
	//gerekirse null kontrolleri yapılabilir.
}
