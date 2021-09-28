package lab7Part1Question3;

public class Circle extends TwoDimShape {

    private float radius;

    // Base Constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    // Constructor w/ Name
    public Circle(String name, float radius) {
        super.shapeName = name;
        this.radius = radius;
    }

    // Method to return the area
    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    // Method to "draw" the shape
    @Override
    public void drawShape() {
        System.out.println("Drawing a circle with a radius of "+radius+"...");
    }

    // toString method
    @Override
    public String toString() {
        return "Class Name: " + this.getClass() + "Shape Name: " + getShapeName();
    }
}
