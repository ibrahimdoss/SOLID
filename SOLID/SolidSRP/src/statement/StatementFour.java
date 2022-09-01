package statement;

public class StatementFour {

	/*"w'i" hesaplamak pek çok yerde gerekli bir iş ise bu durumda copy-paste ile kodun 
	dağılmasını önlemek için bu iş bir metoda dönüştürülmelidir.*/
	
	public double calculateW(double a, int b , int c) {
		
		double w = 0.0;
		++b;
		b = b^2;
		double d = c / a;
		w = a + (b + 2) * d;
		return w;
	}
	
}
