package lab7Part1Question3;

public abstract class TwoDimShape extends Shape {

    public TwoDimShape() {

    }

    @Override
    abstract double getArea();

    @Override
    abstract void drawShape();

    @Override
    public String toString() {
        return "Class Name: " + this.getClass() + "Shape Name: " + getShapeName();
    }

}
