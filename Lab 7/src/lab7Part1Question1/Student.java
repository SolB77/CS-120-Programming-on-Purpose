package lab7Part1Question1;

public class Student extends Person {
	private String classStatus;
	
	public Student(String name) {
		super.name = name;
	}
	
	public Student(String name, String classStatus) {
		super.name = name;
		this.classStatus = classStatus;
	}
	
	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
	
	public String getClassStatus() {
		return classStatus;
	}
	
	@Override
	public String toString() {
		return "Class Name: " + this.getClass() + "Person Name: " + getName();
	}

}
