package lab7Part1Question3;

public class Sphere extends ThreeDimShape {

    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a sphere with a radius of "+radius+"...");
    }

    @Override
    public double getVolume() {
        return ((4/3) * Math.PI * Math.pow(radius, 3));
    }

    public String toString() {
        return "Sphere\nRadius: " + radius;
    }

}
