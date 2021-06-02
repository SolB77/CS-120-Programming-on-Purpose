package lab7Part1Question3;

public class RectangularPrism extends ThreeDimShape {

    private float height;
    private float width;
    private float depth;

    public RectangularPrism(float height, float width, float depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return (2*((depth*width)+(depth*height)+(width*height)));
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a rectangular prism with a height of "+height+", width of "+width+", and depth of "+depth+"...");
    }

    @Override
    public double getVolume() {
        return (height * width * depth);
    }

    public String toString() {
        return "Rectangular Prism\nHeight: " + height + "\nWidth: " + width + "\nDepth: " + depth;
    }

}
