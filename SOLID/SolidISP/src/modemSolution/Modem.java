package modemSolution;

public class Modem implements Connection, DataChannel {

	@Override
	public void send(char c) {

	}

	@Override
	public char recv() {
		return 0;
	}

	@Override
	public void dial(String pno) {

	}

	@Override
	public void hangup() {

	}
}
