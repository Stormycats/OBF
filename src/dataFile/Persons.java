package dataFile;

abstract public class Persons {

	private String personCode;
	private String lastName;
	private String firstName;
	private String emails;
	private Address address;
	
	//getAddress
	//getBroker
	
	public Persons(String personCode, String lastName, String firstName, String emails) {
		super();
		this.personCode = personCode;
		this.lastName = lastName;
		this.firstName = firstName;
		this.emails = emails;
	}

	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}
	
	
	public Address address() {
		return address;
	}
	
	
}
