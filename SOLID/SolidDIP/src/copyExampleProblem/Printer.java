
package copyExampleProblem;

import java.io.PrintStream;

public class Printer {
	private PrintStream out = System.out;
	
	public void write(char ch){
		out.print(ch);
	}
}
