package TUT3.Point2D;

import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //standard approach (works even when the input is typed in separately)
        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        Point2D p1 = new Point2D(x1, y1);
        input.nextLine();

        //more nuance approach (only works when the input is in one line)
        //should be wrapped in exception handling
        System.out.print("Enter point1's x-, y-coordinates: ");
        String coord2 = input.nextLine();
        String[] coord2Value = coord2.split(" ");
        Point2D p2 = new Point2D(Double.parseDouble(coord2Value[0]), Double.parseDouble(coord2Value[1]));

        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());

        double dist = p1.distance(p2);
        System.out.println("The distance between p1 and p2 is " + dist);

        input.close();
    }
}
