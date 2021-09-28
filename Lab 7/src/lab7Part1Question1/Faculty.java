package lab7Part1Question1;

public class Faculty extends Employee {

	private String officeHours;
	private String rank;
	
	public Faculty(String name) {
		super();
		super.name = name;
	}
	
	public Faculty(String officeHours, String rank) {
		super();
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	
	public String getRank() {
		return rank;
	}
	
	@Override
	public String toString() {
		return "Class Name: " + this.getClass() + "Person Name: " + getName();
	}

}
