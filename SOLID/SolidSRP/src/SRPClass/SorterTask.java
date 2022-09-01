package SRPClass;

public class SorterTask {
	
	SorterTaskFactory sorterTaskFactory = new SorterTaskFactory();
	
	//Sorter
	Sorter<Product> sorter = sorterTaskFactory.create();
	Collection<Product> list = null;
	
	//...
	sorter.sort(list);
	
	//Thread
	Thread sorterThread = (Thread) sorter;
	sorterThread.run();
	
	//Comparable
	Comparable comparableSorter2 = (Comparable) sorterTaskFactory.create();
	Comparable comparableSorter1 = (Comparable) sorter;
	comparableSorter1.compareTo(comparableSorter2);
	
	
	//Yukarıdaki kodu SRP ye uygun şekilde ayarlamak için "classSrp" imagedeki gibi 
	//ayarlayabiliriz.
}
