package lab7Part1Question3;

public abstract class Shape {
    String shapeName;

    public Shape() {

    }

    public Shape(String name) {
        this.shapeName = name;
    }

    public void setshapeName(String name) {
        this.shapeName = name;
    }

    protected String getShapeName() {
        return shapeName;
    };

    abstract double getArea();

    abstract void drawShape();

    @Override
    public String toString() {
        return "Class Name: " + this.getClass() + "Shape Name: " + getShapeName();
    }

}
