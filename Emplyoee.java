public class Emplyoee {
    int id;
    String name;
    double salary;
    Emplyoee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("salary="+salary);
    }
    public static void main(String[] args) {
        Emplyoee e = new Emplyoee(1, "Tanishq",3400.56);
        Emplyoee e1 = new Emplyoee(2, "Kale", 56000.9);
        e.display();
        e1.display();
       


    }
    

}
