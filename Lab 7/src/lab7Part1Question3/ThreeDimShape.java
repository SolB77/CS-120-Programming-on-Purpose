package lab7Part1Question3;

public abstract class ThreeDimShape extends Shape {

    public ThreeDimShape() {

    }

    @Override
    abstract double getArea();

    @Override
    abstract void drawShape();

    abstract double getVolume();

    @Override
    public String toString() {
        return "Class Name: " + this.getClass() + "Shape Name: " + getShapeName();
    }

}
