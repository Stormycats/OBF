package dataFile;

public class Deposits extends Assets {

	private double APR;

	public Deposits(String code, String type, String label, double APR) {
		super(code, type, label);
		this.APR = APR;
	}
	
	
	
}
