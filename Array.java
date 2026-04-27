public class Array {
    double id;
    String name;

    Array(double id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Array[] students = new Array[3];
        students[0] = new Array(1, "Tanishq");
        students[1] = new Array(2, "Shivam");
        students[2] = new Array(3, "yatin");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }

}
