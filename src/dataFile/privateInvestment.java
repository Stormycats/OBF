package dataFile;

public class privateInvestment extends Asset{



	private double quarterlyDividend;
	private double baseRateOfReturn;
	private double omegaMeasure;
	private double totalValue;

	public privateInvestment(String code, String type, String label, double quarterlyDividend, double baseRateOfReturn, double omegaMeasure, double totalValue) {
		super(code, type, label);
		this.quarterlyDividend = quarterlyDividend;
		this.baseRateOfReturn = baseRateOfReturn;
		this.omegaMeasure = omegaMeasure;
		this.totalValue = totalValue;
	}

}
