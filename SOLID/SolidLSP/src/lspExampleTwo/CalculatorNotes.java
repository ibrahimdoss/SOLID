package lspExampleTwo;

public enum CalculatorNotes {

	/*
	 * Calculator iki tam sayıyı toplama hizmeti vermektedir.
	 * 
	 * PositiveCalculator ise iki pozitif tam sayıyı toplama hizmeti vermektedir ama
	 * negatif argüman geçilmesi durumunda NegativeArgumentException fırlatmak
	 * istemekte.
	 * 
	 * Bu ise Design by Contract'ın tavsiye ettiğinin tersine, üst tipteki add()
	 * davranışında olmayan bir ön şart eklemektir.
	 * 
	 * Üst tipin davranışlarıyla ilgili olarak öne sürmediği bir şartı alt tipin öne
	 * sürmesi ya da var planı daha da sıkılaştırması sadece fırlatılan sıra dışı
	 * durumlarda söz konusu olmaz.
	 * 
	 * PositiveCalculator iki pozitif tam sayıyı toplama hizmeti vermek için önce
	 * bir kontrol yapar sonra uygunsa işlemi gerçekleştirir, aksi takdirde -1
	 * döndürür.
	 * 
	 * Bu da Design by Contract'ın tavsiye ettiğinin tersine, üst tipteki davranışta
	 * olmayan bir ön şart eklemektir.
	 * 
	 * Bu da Calculator ile çalışmasını bilen istemciyi şaşırtır ve onu RTTI ile
	 * gerçek tipleri kullanmaya zorlar.
	 */
}
