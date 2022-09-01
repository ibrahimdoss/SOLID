package AccountExample;

public enum AccountExampleNotes {

	/*
	 * burada cohesion kötü çünkü Account'un içine girmişken methodda amount'un en
	 * başta negatif olup olmadığı kontrol ediliyor, dolasıyla daha bunu bilmiyorsa
	 * bunu methodun içinde yapmak yerine buraya gelmeden önce bunu negatif olup
	 * olmama durumunu check etmesi lazım.
	 * 
	 * ikinci durum ise buraya girse bile bu check işlemi methodun adı changeBalance
	 * yani bununla alakalı bir işlem değil.
	 * 
	 * Bir diğer konu ise action kısmı burası değişime açık bir şekilde duruyor ve
	 * üzerinde çok işlem yapılacak bir değer ve actionun tipinden dolayı n tane if
	 * gelebilir.
	 * 
	 * 
	 */
}
