package lab7Part1Question3;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("Testing/Demoing Question 3 (Shape Problem)...");
        // Create Shapes
        System.out.println("Creating shapes...");
        Circle circle = new Circle("circle",8);
        Rectangle rectangle = new Rectangle("rectangle",5,6);
        Sphere sphere = new Sphere("sphere",12);
        RectangularPrism recPris = new RectangularPrism("recPris",5,4,3);
        System.out.println();

        // To String Methods
        System.out.println("Testing to string methods...");
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(sphere.toString());
        System.out.println(recPris.toString());
        System.out.println();

        // Draw Shapes (Had trouble using JavaFX Draw for 3D specifically)
        System.out.println("Drawing shapes...");
        circle.drawShape();
        rectangle.drawShape();
        sphere.drawShape();
        recPris.drawShape();
        System.out.println();

        // Print Areas
        System.out.println("Calculating Areas...");
        System.out.printf("The area of circle1 is: %.3f %n", circle.getArea());
        System.out.printf("The area of rectangle1 is: %.3f %n", rectangle.getArea());
        System.out.printf("The area of sphere1 is: %.3f %n", sphere.getArea());
        System.out.printf("The area of recPris1 is: %.3f %n", recPris.getArea());
        System.out.println();

        // Print Volumes
        System.out.println("Calculating Volumes...");
        System.out.printf("The volume of sphere1 is: %.3f %n", sphere.getVolume());
        System.out.printf("The volume of recPris1 is: %.3f %n", recPris.getVolume());
        System.out.println();

        System.out.println("Test/Demo Complete...");

    }
}
