package Sequential;

public class Part {
	
	public Parts createPart(input) {
        setInput(input);
        computePartOne();
        computePartTwo();
        computePartThree();
        PartsBuilder partsBuilder = new PartsBuilder();
        return partsBuilder.add(this.PartOne).add(this.PartTwo).add(this.PartThree).build();
    }
}
