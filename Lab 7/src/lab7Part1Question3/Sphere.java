package lab7Part1Question3;

public class Sphere extends ThreeDimShape {

    private float radius;

    // Base constructor
    public Sphere(float radius) {
        super();
        this.radius = radius;
    }

    // Constructor w/ name
    public Sphere(String name, float radius) {
        super();
        super.shapeName = name;
        this.radius = radius;
    }

    // Method to return the area
    @Override
    public double getArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    // Method to "draw" the shape
    @Override
    public void drawShape() {
        System.out.println("Drawing a sphere with a radius of "+radius+"...");
    }

    // Method to return the volume
    @Override
    public double getVolume() {
        return ((4/3) * Math.PI * Math.pow(radius, 3));
    }

    // toString method
    @Override
    public String toString() {
        return "Class Name: " + this.getClass() + "Shape Name: " + getShapeName();
    }

}
