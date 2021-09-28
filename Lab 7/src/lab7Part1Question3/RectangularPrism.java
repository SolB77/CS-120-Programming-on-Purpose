package lab7Part1Question3;

public class RectangularPrism extends ThreeDimShape {

    private float height;
    private float width;
    private float depth;

    // Base constructor
    public RectangularPrism(float height, float width, float depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // Constructor w/ name
    public RectangularPrism(String name, float height, float width, float depth) {
        super.shapeName = name;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // Method to return the area
    @Override
    public double getArea() {
        return (2*((depth*width)+(depth*height)+(width*height)));
    }

    // Method to "draw" the shape
    @Override
    public void drawShape() {
        System.out.println("Drawing a rectangular prism with a height of "+height+", width of "+width+", and depth of "+depth+"...");
    }

    // Method to return the volume
    @Override
    public double getVolume() {
        return (height * width * depth);
    }

    // toString method
    @Override
    public String toString() {
        return "Class Name: " + this.getClass() + "Shape Name: " + getShapeName();
    }

}
