public class Book {
    int bookId;
    String title;
    double price;
    Book(int bookId, String title, double price){
         this.bookId = bookId;
         this.title = title;
         this.price = price;
    }
void display(){
 
    if (price > 500) {
            System.out.println("ID: " + bookId);
            System.out.println("Title: " + title);
            System.out.println("Price: " + price);
            System.out.println("------------------");
        }
}

public static void main(String[] args) {
    Book B1 = new Book(1, "Tomb of stone", 564.5);
    Book B2 = new Book(2, "Secret", 234.6);
    Book B3 = new Book(3, "Lost", 555.9);
B1.display();
B2.display();
B3.display();

}
}
