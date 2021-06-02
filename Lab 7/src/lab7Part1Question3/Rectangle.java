package lab7Part1Question3;

public class Rectangle extends TwoDimShape {

    private float height;
    private float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (height * width);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a rectangle with a height of "+height+" and a width of "+width+"...");
    }

    public String toString() {
        return "Rectangle\nHeight: " + height + "\nWidth: " + width;
    }
}
