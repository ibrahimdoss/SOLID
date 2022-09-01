package statement;

public class StatementTwo {
	
	//Bir cümlede hiç bir zaman tekrar olmamalıdır.
	
	//Tekrar edecek kısım ayrı bir cümlede olmalı ve yerel bir değişkene atanmalıdır.
	
	double  w = a+ ++b * c / a + b + 2 * c / a;
	
	
	double w = 0.0;
	
	{
		++b;
		double d = c / a;
		w = a + b * b * d + 2 * d;
	}
	
	
	//Bu yüzden aşağıdaki gibi olmalıdır.
	
	double w = 0.0;
	{
		++b;
		b = b^2;
		double d = c / a;
		w = a + (b + 2) * d;
	}

}
