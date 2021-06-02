import javax.swing.*;

public class StudentIO2 {

    public static void main(String[] args) {

        int i;
        int numStudents;
        int age;
        float gpa;
        int id;
        int year;
        float numCredits;
        float totalCredits;

        numStudents = Integer.parseInt(JOptionPane.showInputDialog("Number of students: "));

        for ( i = 0; i < numStudents; i = i + 1 ) {

            String input_message = "Enter Student Number " + (i+1) + " Info:";

            JOptionPane.showMessageDialog(null, input_message);

            age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));

            gpa = Float.parseFloat(JOptionPane.showInputDialog("GPA: "));

            id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));

            year = Integer.parseInt(JOptionPane.showInputDialog("Year: "));

            numCredits = Float.parseFloat(JOptionPane.showInputDialog("Credits taken so far: "));

            totalCredits = Float.parseFloat(JOptionPane.showInputDialog("Total credits required: "));

            String output = "Age : " + age + "\nGPA: " + gpa + "\nID: " + id + "\nYear: " + year +
                    "\nCredits completed: " + numCredits + "\nTotal credits required: " + totalCredits +
                    "\nCredits remaining: " + (totalCredits-numCredits) + "\n" + (i+1) + " completed.";
            JOptionPane.showMessageDialog(null, output);
        }

        JOptionPane.showMessageDialog(null, "Report completed.");



    }

}

