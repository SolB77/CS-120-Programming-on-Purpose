package lab7Part1Question1;

public class Staff extends Employee{
	private String title;
	
	public Staff(String name) {
		super.name = name;
	}
	
	public Staff(String name, String title) {
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "Class Name: " + this.getClass() + "Person Name: " + getName();
	}

}
