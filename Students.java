 class Students {
int rollNo;
String name;
 
public static void main(String[] args) {
    Students Tanishq = new Students();
    Students Manan = new Students();
    Tanishq.rollNo = 1;
    Manan.rollNo = 9;   
    Tanishq.name = "tan";
    Manan.name = "man";
    System.out.println(Tanishq.rollNo+" "+Tanishq.name);
    System.out.println(Manan.rollNo+" "+Manan.name);
}

}
