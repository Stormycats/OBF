package dataFile;

public class Stocks extends Assets {

	private double qDiv;
	private double baseROR;
	
	public Stocks(String code, String type, String label, double qDiv, double baseROR) {
		super(code, type, label);
		this.qDiv = qDiv;
		this.baseROR = baseROR;
	}
	
	//Beta
}
