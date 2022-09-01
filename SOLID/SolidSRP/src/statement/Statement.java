package statement;

public class Statement {
	
	double calculate = a + ++b * c/a * b;
	//yukarıda öncelik karmaşıklığından dolayı anlamada zorluk var.
	
	//1- Bu yüzden birden fazla daha rahat anlaşılır satıra bölünmeli,
	//2- blok hatta kopyalanarak dağılma ihtimali varsa metot olmalıdır.
	
	
	//1
	double w = 0.0;
	{
		b++;
		w = a + b * b * c / a;
	}
	
	
	//2
	double calculatemetot(double a, int b, int c) {
		b++;
		double w = a + b * b * c / a;
		return w;

	}
	
	
}
