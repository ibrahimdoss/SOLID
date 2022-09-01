package lspExampleThree;

public class VipTaxi extends Taxi {

	public VipTaxi(String string) {
		super(string);
	}

	public boolean checkPrecondition(Customer customer) {
		return true;
	}

	@Override
	public VipService service() {
		return new VipService();
	}
}
