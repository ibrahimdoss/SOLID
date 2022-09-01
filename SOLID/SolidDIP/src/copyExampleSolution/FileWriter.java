
package copyExampleSolution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class FileWriter implements Writer{
	private java.io.FileWriter out;
	
	private File file;

	public FileWriter(String fileName) {
		file = new File(fileName);
		try {
			out = new java.io.FileWriter(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Opps! Something went wrong: " + e.getMessage()) ;
		}
	}
	
	
	@Override
	public void write(char ch){
		try {
			out.write(ch);
		} catch (IOException e) {
			System.out.println("Opps! Something went wrong: " + e.getMessage()) ;
		}
	}


	@Override
	public void close() {
		try {
			out.close();
		} catch (IOException e) {
			System.out.println("Opps! Something went wrong when closing FileWriter: " + e.getMessage());
		}
	}
}
