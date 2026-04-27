class Shape {
    String name;

    Shape() {
        this("Unknown Shape");
    }

    Shape(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Shape: " + name);
    }
}

class Rect extends Shape {
    int length;
    int breadth;

    Rect() {
        this(1, 1);
    }

    Rect(int length) {
        this(length, 1);
    }

    Rect(int length, int breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }
}

class Circle extends Shape {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Total {
    public static void main(String[] args) {

        Rect r1 = new Rect(2, 4);
        Rect r2 = new Rect(4, 6);

        Circle c1 = new Circle(2.4);
        Circle c2 = new Circle(5.9);

        System.out.println("Area of r1: " + r1.area());
        System.out.println("Perimeter of r1: " + r1.perimeter());

        System.out.println("Area of r2: " + r2.area());
        System.out.println("Perimeter of r2: " + r2.perimeter());

        System.out.println("Area of c1: " + c1.area());
        System.out.println("Perimeter of c1: " + c1.perimeter());

        System.out.println("Area of c2: " + c2.area());
        System.out.println("Perimeter of c2: " + c2.perimeter());
    }
}
