package dataFile;

public class Address extends Persons {

	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	private Address address;
	
	public Address(String personCode, String lastName, String firstName, String emails, String street, String city,
			String state, int zip, String country) {
		super(personCode, lastName, firstName, emails);
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}


	public String getStreet() {
		return street;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public int getZip() {
		return zip;
	}


	public String getCountry() {
		return country;
	}
	
	
	
}
