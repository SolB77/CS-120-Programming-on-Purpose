package lab7Part1Question1;

public class TestCollege {

	public static void main(String[] args) {
		System.out.println("Testing/Demoing Question 1 (College Problem)...");
		// Create College
		Person johnPerson = new Person("John");
		Student michelleStudent = new Student("Michelle");
		Employee lisaEmployee = new Employee("Lisa");
		Faculty samFaculty = new Faculty("Sam");
		Staff eliasStaff = new Staff("Elias");

		// To String Methods
		System.out.println(johnPerson.toString());
		System.out.println(michelleStudent.toString());
		System.out.println(lisaEmployee.toString());
		System.out.println(samFaculty.toString());
		System.out.println(eliasStaff.toString());
		System.out.println();
	}

}