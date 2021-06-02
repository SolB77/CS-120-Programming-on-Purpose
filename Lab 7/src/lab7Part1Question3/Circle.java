package lab7Part1Question3;

public class Circle extends TwoDimShape {

    private float radius;

    // Constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    // Area Accessor
    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    //
    @Override
    public void drawShape() {
        System.out.println("Drawing a circle with a radius of "+radius+"...");
    }

    public String toString() {
        return "Circle\nRadius: " + radius;
    }
}
