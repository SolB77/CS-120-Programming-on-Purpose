package lab6;

public class RectangleDemo {
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
