import java.util.Scanner;

public class StudentIO {

    public static void main(String[] args) {

        int i;
        int numStudents;
        int age;
        float gpa;
        int id;
        int year;
        float numCredits;
        float totalCredits;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Number of students: ");
        numStudents = scnr.nextInt();
        System.out.println("");

        for ( i = 0; i < numStudents; i = i + 1 ) {
            System.out.println("Enter Student Number " + (i+1) + " Info:");
            System.out.println("");
            System.out.println("Age: ");
            age = scnr.nextInt();

            System.out.println("GPA: ");
            gpa = scnr.nextFloat();

            System.out.println("ID: ");
            id = scnr.nextInt();

            System.out.println("Year: ");
            year = scnr.nextInt();

            System.out.println("Credits taken so far: ");
            numCredits = scnr.nextFloat();

            System.out.println("Total credits required: ");
            totalCredits = scnr.nextFloat();
            System.out.println("");

            System.out.println("Age: " + age);
            System.out.println("GPA: " + gpa);
            System.out.println("ID: " + id);
            System.out.println("Year: " + year);
            System.out.println("Credits completed: " + numCredits);
            System.out.println("Total credits required: " + totalCredits);
            System.out.println("Credits remaining: " + (totalCredits-numCredits));
            System.out.println((i+1) + " completed");
            System.out.println("");
        }

        scnr.close();

        System.out.println("Report completed.");
    }

}
