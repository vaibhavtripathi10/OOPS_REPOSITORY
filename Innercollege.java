class college {
    String name;
    String city;
    
    college(){
        this("unknown");
    }
college(String name){
this.name = name;

}
college(String name,String city){
this.name = name;
this.city = city;
}
void display(){
    System.out.println("The college name is:"+name);


}

}
class student extends college{
int id;
String stuname;

student(){
this(0,"unknown");

}
student(int id){
this.id = id;
}


student(int id, String stuname){
    super("Studenet");
this.id = id;
this.stuname = stuname;

}

void displayName(){
    System.out.println("The student name is:"+stuname);

}


}
public class Innercollege {
public static void main(String[] args) {
    college c1 = new college("Ramdeobaba University", "Nagpur");
    college c2 = new college("RGPV", "Bhopal");
    
     student s1 = new student(1, "Tanishq");
     student s2 =  new student(3, "Shivam");
s1.displayName();
c1.display();

s2.displayName();
c2.display();


}
    
}



