class Student3{
    int id ;
    String name;
    Student3(int i, String n){
       id = i;
       name = n;
    }
    Student3(){
        System.out.println("default");
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
     Student3 s1 = new Student3();
     Student3 s2 = new Student3();
     s1.display();
     s2.display();   
    }

}