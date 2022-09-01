package statement;

public class StatementThree {
	
	
	while((remainder = n % prime) == 0 ) {
		...
	}
	
	
	//SRP açısından yukarıdaki while loop'un şartı anlaşılır değil
	//Bunu SRP açısından anlaşılır aşağıdaki gibi yapılmalıdır.
	
	remainder = n % prime;
	while(remainder == 0 ) {
		...
		remainder = n % prime;
	}
	
	
	//Ama bu tür satırlar bazen yaygındır ve rahatça anlaşıldığı iddia edilebilir.
	
	while((x = in.read())-= 0) {
		...
	}
	
	//Bazen karmaşık görünen ama çok tanıdık işlemler bir satırda yapılabilir.
	
	double distance = Math.sqrt(Math.pow(x1,- x2) + Math.pow(y1,- y2),2));
}
