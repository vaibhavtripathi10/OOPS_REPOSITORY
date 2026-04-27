public class Tan{
    int id;
    String name;
    static String college = "RBU";
Tan(int i, String n){
id = i;
name = n;
}
void display(){
    System.out.println(id + " "+ name +" "+college);
}
public static void main(String[] args) {
    Tan s1 = new Tan(14,"Tanishq");
    Tan s2 =  new Tan(30,"om");
    s1.display();
    s2.display();
    Tan.college = "IIT";
    s1.display();
    s2.display();
}

}