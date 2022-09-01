package lspExampleTwo;

/**
 * Counter example for design by contract. PositiveCalculator enforces a new
 * condition as a preceondition whereas its parent has no precondition.
 * 
 * @author akin
 *
 */
public class PositiveCalculator extends Calculator {
	
	public int add(int i, int j) throws NegativeArgumentException {
		if (i <= 0 | j <= 0)
			throw new NegativeArgumentException();
		return i + j;
	}	
}
