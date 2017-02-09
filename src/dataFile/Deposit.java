package dataFile;

public class Deposit extends Asset {

	private double apr;

	public Deposit(String code, String type, String label, double apr) {
		super(code, type, label);
		this.apr = apr;
	}

}
