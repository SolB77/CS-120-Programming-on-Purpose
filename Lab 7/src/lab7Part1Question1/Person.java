package lab7Part1Question1;

public class Person {
	String name;
	String phoneNumber;
	String homeAddress;
	String emailAddress;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person (String name1, String homeAddress1, String phoneNumber1, String emailAddress1) {
		name = name1;
		homeAddress = homeAddress1;
		phoneNumber = phoneNumber1;
		emailAddress = emailAddress1;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getName() {
		return name;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	@Override
	public String toString() {
		return "Class Name: " + this.getClass() + "Person Name: " + getName();
	}

}

