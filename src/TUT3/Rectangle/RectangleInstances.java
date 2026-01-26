package TUT3.Rectangle;

public class RectangleInstances {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1); //test toString()
        Rectangle r2 = new Rectangle(); //test default constructor
        System.out.println(r2);

        //test setters and getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);

        System.out.println("Length is: " + r1.getLength());
        System.out.println("Width is: " + r1.getWidth());

        //test getArea() and getPerimeter()
        System.out.printf("Area is: %.2f%n", r1.getArea());
        System.out.printf("Perimeter is: %.2f%n", r1.getPerimeter());
    }
}
