package lab7Part1Question1;

public class Employee extends Person {
	private String office;
	private String salary;
	private MyDate dateHired;

	public Employee(String name) {
		super.name = name;
	}
	
	public Employee(String name, String office, String salary, MyDate dateHired) {
		super.name = name;
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public Employee() {

	}

	public void setOffice(String office) {
		this.office = office;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public MyDate getDateHired() {
		return dateHired;
	}
	
	@Override
	public String toString() {
		return "Class Name: " + this.getClass() + "Person Name: " + getName();
	}

}
