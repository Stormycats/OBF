package dataFile;

public class Stock extends Asset {

	private double quarterlyDividend;
	private double baseRateOfReturn;
	private double betaMeasure;
	private String stockSymbol;
	private double sharePrice;

	public Stock(String code, String type, String label, double quarterlyDividend, double baseRateOfReturn, double betaMeasure, String stockSymbol, double sharePrice) {
		super(code, type, label);
		this.quarterlyDividend = quarterlyDividend;
		this.baseRateOfReturn = baseRateOfReturn;
		this.betaMeasure = betaMeasure;
		this.stockSymbol = stockSymbol;
		this.sharePrice = sharePrice;
	}

}
