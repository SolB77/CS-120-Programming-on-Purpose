package lab7Part1Question3;

public class Rectangle extends TwoDimShape {

    private float height;
    private float width;

    // Base constructor
    public Rectangle(float height, float width) {
        super();
        this.height = height;
        this.width = width;
    }

    // Constructor w/ name
    public Rectangle(String name, float height, float width) {
        super.shapeName = name;
        this.height = height;
        this.width = width;
    }

    // Method to return the area
    @Override
    public double getArea() {
        return (height * width);
    }

    // Method to "draw" the shape
    @Override
    public void drawShape() {
        System.out.println("Drawing a rectangle with a height of "+height+" and a width of "+width+"...");
    }

    // toString method
    @Override
    public String toString() {
        return "Class Name: " + this.getClass() + "Shape Name: " + getShapeName();
    }
}
