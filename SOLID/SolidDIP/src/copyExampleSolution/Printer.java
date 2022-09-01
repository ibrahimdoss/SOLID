
package copyExampleSolution;

import java.io.PrintStream;

public class Printer implements Writer{
	private PrintStream out = System.out;
	
	@Override
	public void write(char ch){
		out.print(ch);
	}

	@Override
	public void close() {
		
	}
}
