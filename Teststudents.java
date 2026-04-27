class Student{
    int id;
    String name;
}
class Teststudents{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 19;
        s1.name = "tan";
        s2.id = 12;
        s2.name = "ram";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}