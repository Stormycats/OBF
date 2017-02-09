package dataFile;

public class Broker extends Persons {

	private String Expert;
	private String Junior;
	private String SEB;
	
	
	public Broker(String personCode, String lastName, String firstName, String emails, String expert, String junior,
			String sEB) {
		super(personCode, lastName, firstName, emails);
		Expert = expert;
		Junior = junior;
		SEB = sEB;
	}


	public String getExpert() {
		return Expert;
	}


	public String getJunior() {
		return Junior;
	}


	public String getSEB() {
		return SEB;
	}
	
	
	
}
