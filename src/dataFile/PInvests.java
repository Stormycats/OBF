package dataFile;

public class PInvests extends Assets{

	private double qDiv;
	private double baseROR;
	
	public PInvests(String code, String type, String label, double qDiv, double baseROR) {
		super(code, type, label);
		this.qDiv = qDiv;
		this.baseROR = baseROR;
	}
	
	//Omega
}
