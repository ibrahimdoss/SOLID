package statement;

public class StatementDifferentExamples {
	
//	Yüksek ifade gücüne sahip yapılar SRP'ye tersmiş gibi görünebilir ama değildir,
//	o türden ifadeler bağlamsaldırlar ve kültürel bir norm gibi görülürler:
	
	//Aşağıdaki yapılar SRP açısından ters gibi gözüken ama ama aslında kültürel bir norm 
	//olan yapıların bir takım örnekleri listelenmiştir.
		
		//ornekOne
		//Builder kalıbında:
			
		return Response.status(Response.Status.OK)
				.entity(message)
				.type(MediaType.TEXT_PLAIN)
				.build();
	
	
	Trigger trigger = TriggerBuilder.newTrigger()
			.withIdentity("myTrigger", "myTriggerGroup")
			.startNow()
			.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1)
			.repeatForever()).build();
	
	
	//Fonksiyonel stilde stream ile veri işlemede:
	
	Arrays.stream(array).filter(x->x%2==0).map(n->n*n).average().ifPresent(System.out:::println);
	
	Arrays.stream(array)
	.filter(x->x%2==0)
	.map(n->n*n)
	.average()
	.ifPresent(System.out:::println);
	
	
	// java.util.stream.Collectors sınıfından bir metot:
	
	static <T,K,D,A,M extends Map<K, D>> Collector<T,?,M> groupingBy(Function<? super T,? extends K>
	classifier, Supplier<M> mapFactory,
	Collector<? super T, A, D> downstream);
	
	
	//Dekoratör kalıbında:
	
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
	
	//Mock nesnelerini eğitme:
	
	when(selam.selamSoyle(anyString())).thenReturn("Selam" + anyString() + " :)" );
	
	//Regular expressions:
	
	matcher.group().replaceFirst("href =\"", "")
					.replaceFirst("\">", "")
					.replaceFirst("\"[\\s]?target=\"[a-zA-Z_0-9]*","");
	

	
	

}
