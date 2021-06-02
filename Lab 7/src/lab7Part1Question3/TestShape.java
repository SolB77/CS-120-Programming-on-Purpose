package lab7Part1Question3;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("Testing/Demoing Question 3 (Shape Problem)...");
        // Create Shapes
        Circle circle1 = new Circle(8);
        Rectangle rectangle1 = new Rectangle(5,6);
        Sphere sphere1 = new Sphere(12);
        RectangularPrism recPris1 = new RectangularPrism(5,4,3);
        System.out.println();

        // Draw Shapes (Had trouble using JavaFX Draw for 3D specifically)
        circle1.drawShape();
        rectangle1.drawShape();
        sphere1.drawShape();
        recPris1.drawShape();
        System.out.println();

        // Print Areas
        System.out.printf("The area of circle1 is: %.3f %n", circle1.getArea());
        System.out.printf("The area of rectangle1 is: %.3f %n", rectangle1.getArea());
        System.out.printf("The area of sphere1 is: %.3f %n", sphere1.getArea());
        System.out.printf("The area of recPris1 is: %.3f %n", recPris1.getArea());
        System.out.println();

        // Print Volumes
        System.out.printf("The volume of sphere1 is: %.3f %n", sphere1.getVolume());
        System.out.printf("The volume of recPris1 is: %.3f %n", recPris1.getVolume());
        System.out.println();

        System.out.println("Test/Demo Complete...");

    }
}
