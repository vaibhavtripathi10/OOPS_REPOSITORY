public class Point {
    int x,y;
    Point(int x, int y){
this.x = x;
this.y = y;
    } 
    void display(){
System.out.println("System.out.println(\"x = \" + x + \", y = \" + y);");

    } 
void addPoint(Point Second){
int newX = this.x+Second.x;
int newY = this.y+Second.y;
System.out.println("Sum Point: (" + newX + ", " + newY + ")");

}
public static void main(String[] args) {
    Point p1 = new Point(4, 5);
    Point p2 = new Point(3, 4);
    p1.display();
    p1.addPoint(p2);

}

}
