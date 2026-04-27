public class Rectangle {
    double length;
    double breadth;
    double side;
    Rectangle(double length,double breadth){
this.length = length;
this.breadth = breadth;
    }

    Rectangle(double side){
     this.side = length*length;
    }
double area(){
    return side;
}
double area(double length,double breadth){
return length*breadth;
}

public static void main(String[] args) {
    Rectangle r1 = new Rectangle(4.0, 56.0);
    Rectangle r2 = new Rectangle(6.0);

    System.out.println("The area of rectangle is :"+r1.area(4.0, 56.0));
    System.out.println("The area of rectangle if length = breadth :"+r2.area());
}



}
