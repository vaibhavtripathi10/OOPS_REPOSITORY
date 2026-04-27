 class Student4 {
    int roll;
    String name;
    Student4(int roll,String name){
        this.roll = roll;
        this.name = name;

    }
void display1(){
    System.out.println("Name"+name);
    System.out.println("Roll:"+roll);
}

}

class Book{
int bookId;
String title;
double price;

Book(int bookId,String title,double  price){
this.bookId = bookId;
this.title = title;
this.price = price;
}

void displayBook(){
    System.out.println("Book Id :"+bookId);
System.out.println("title:"+title);
System.out.println("price:"+price);
}


}

public class InnerStudent4 {
public static void main(String[] args) {
    Student4 s1 =  new Student4(1, "Tanishq");
    Student4 s2 = new Student4(69, "David");

Book b1 = new Book(2, "IKIGAI", 90.8);
Book b2 = new Book(4, "Lavasa Incident", 78.9);
System.out.println("Student 1 details:");
s1.display1();
b1.displayBook();
s2.display1();
b2.displayBook();


}
    
}


