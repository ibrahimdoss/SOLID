
package copyExampleProblem;

/**
 * @author akin
 *
 */
public class CopyTest {

	public static void main(String[] args) {
		Keyboard in = new Keyboard();
		Printer out = new Printer(); 
		
		Copy copy = new Copy(in, out);
		copy.start();
	}
}
