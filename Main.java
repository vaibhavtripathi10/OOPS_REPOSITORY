 class Address {
    String city;
    String state;
    Address(String city,String state ){
       this.city = city;
       this.state = state;
    }
    void display(){
        System.out.println("The city is:"+city);
        System.out.println("Thre state is:"+state);
    }
}
class Student{
    String name;
    int id;
Student(String name,int id){
this.name = name;
this.id = id;

}
void display(){
    System.out.println("Student name is:"+name);
    System.out.println("Student id is:"+id);
}

}
public class Main{
    public static void main(String[] args) {
        Address a  = new Address("bhopal", "Madhya pradesh");
        Address b =  new Address("Nagpur", "Maharashtra");
          
           
           Student s1 = new Student("Tanishq", 1);
           Student s2 = new Student("Yatin", 35);
 a.display();
           s1.display();
           b.display();
           s2.display();
    }
}


