package sep24;

abstract class Shape {

    abstract void area();
}

class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    void area() {
        System.out.println("Rectangle Area = " + (length * width));
    }
}

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    void area() {
        System.out.println("Circle Area = " + (Math.PI * radius * radius));
    }
}

public class sep24 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Circle c = new Circle(7);

        r.area();
        c.area();
    }
}