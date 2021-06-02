package lab6;

public class Rectangle {

    private float height;
    private float width;

    // Constructor w/o parameters
    //public Rectangle() {
    //    this.height = height;
    //    this.width = width;
    //}

    //Constructor w/ parameters
    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    //Mutator for height
    public float setHeight(float height) {
        return this.height=height;
    }

    //Mutator for weight
    public float setWidth(float width) {
        return this.width=width;
    }

    //Accessor for height
    public float getHeight() {
        return height;
    }

    //Accessor for weight
    public float getWidth() {
        return width;
    }

    //Method for calculating area
    public float calcArea() {
        return (height * width);
    }

    //Method for calculating perimeter
    public float calcPerimeter() {
        return (2 * (height * width));
    }

    //Method for determining if square
    public String isSquare() {
        if (height==width) {
            return "Square";
        }
        else {
            return "Rectangle";
        }
    }

    public static void main(String[] args) {
        //Test 1
        Rectangle rec1 = new Rectangle(3,4);
        System.out.println("Results for Rectangle 1:");
        System.out.println("Height: " + rec1.getHeight());
        System.out.println("Width: " + rec1.getWidth());
        System.out.println("Area: " + rec1.calcArea());
        System.out.println("Perimeter: " + rec1.calcPerimeter());
        System.out.println("");
        //Test 2
        Rectangle rec2 = new Rectangle(10,10);
        System.out.println("Current dimensions are " + rec2.getHeight() + " tall and " + rec2.getWidth() + " in width." );
        System.out.println("Setting new height...");
        rec2.setHeight(20);
        System.out.println("New height is " + rec2.getHeight());
        System.out.println("Setting new width...");
        rec2.setWidth(20);
        System.out.println("New width is " + rec2.getWidth());
        System.out.println("This shape is a " + rec2.isSquare());
    }

}
