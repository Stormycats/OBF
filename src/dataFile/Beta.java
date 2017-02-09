package dataFile;

public class Beta extends Stocks {
	

	private double beta;

public Beta(String code, String type, String label, double qDiv, double baseROR, double beta) {
	super(code, type, label, qDiv, baseROR);
	this.beta = beta;
}
	
}
