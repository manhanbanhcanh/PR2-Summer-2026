package TUT3;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){
        this.radius = getRadius();
        this.color = getColor();
    }

    public Circle(double r){
        this.radius = r;
        this.color = getColor();
    }

    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public String toString(){
        return ("Radius: " + getRadius() + ", Color: " + getColor() + ", Area: " + getArea());
    }


    //main method for testing the class (our lecturer said this activity only contains one file)
    public static void main(String[] args){
        Circle c1 = new Circle(2, "blue");
        Circle c2 = new Circle(2);
        Circle c3 = new Circle();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
