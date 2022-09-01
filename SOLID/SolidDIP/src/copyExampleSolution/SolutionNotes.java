package copyExampleSolution;

public enum SolutionNotes {

//	Bir öncekinde somut yapılara olan bağımlılıklar tersine çevrilerek tamamen soyut yapılara dayanacak
//	hale getirilmiştir.
//	
//	Bu durumda interface'lerde değişiklik yapılmadığı müddetçe kötü tasarımın sonucu olan 
//	üç durumu görme ihtimali azalır.
//	
//	Copy'nin somut yapı olan Keyboard ve Printer'a olan bağımlılığı ortadan kalkmıştır.
//		
//		Copy böylece okuma ve yazma işlemi yapan detaylardan tamamen bağımsızdır, bunlardaki
//		değişimlerden de yalıtılmıştır.
//		
//		Copy, Keyboard ve Printer değil ama Reader ve Writer olan her uygulamada tekrar kullanılabilir.
//		
//	
//	Bu çözümde de Copy'nin soyut da olsa Reader ve Writer'a olan bağımlılığı eleştirilebilir.
//	
//	Bu türden soyut bağımlılıklar Adaptör kalıbıyla rahatlıkla aşılabilir.
//	
//	Kaldı ki sıfır bağımlılık söz konusu değildir.
}
