package chapter7.exercises_for_self_control;

public class Exercise2 {
    public static void main(String[] args) {

        Circle c1 = new Circle(12.5,"middle");

        System.out.println(c1.getName());
        System.out.println("Circle area is " + c1.area());
        System.out.println("Alternative area math is " + c1.altArea());
        System.out.printf("Alternative rounded area math is %.4f", c1.altArea());

    }
}

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    //Default constructor
    TwoDShape() {
        width = height = 0.0;
    }

    //Parametrized constructor
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    //Creation of object with equal
    // dimensions
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    //Creation of object based on another object
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    //Access methods to variable copies
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height - " + width + " and " + height);
    }
}


class Circle extends TwoDShape {

    //Default constructor
    Circle() {
        super();
    }

    //Circle constructor
    Circle(double x, String n) {
        super(x,n);
    }

    //Circle object on object constructor
    Circle(Circle obc) {
        super(obc);
    }

    //Area method
    double area() {
        return 3.14 * (getHeight()/2) * (getHeight()/2);
    }

    //Alter area method
    double altArea() {
        return Math.PI * Math.pow(getHeight()/2, 2);
    }

}
