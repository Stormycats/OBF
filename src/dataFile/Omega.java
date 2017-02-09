package dataFile;

public class Omega extends PInvests {
//calculate risk measures
	private double Omega;

public Omega(String code, String type, String label, double qDiv, double baseROR, double omega) {
	super(code, type, label, qDiv, baseROR);
	Omega = omega;
}
	
}
