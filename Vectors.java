public class Vectors {
    int size;
    int[] arr;

    Vectors(int size) {
        this.arr =new int [size];
    }

    void insert(int index, int value) {
        arr[index] = value;

    }

    void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    Vectors add(Vectors other) {
        Vectors result = new Vectors(size);
        for (int i = 0; i < arr.length; i++) {
            result.arr[i] = this.arr[i] + other.arr[i];
        }

        return result;

    }

    public static void main(String[] args) {
        Vectors v1 = new Vectors(3);
        Vectors v2 = new Vectors(3);
        Vectors result = new Vectors(3);

v1.insert(0, 2);
v1.insert(1, 3);
v1.insert(2, 4);




v2.insert(0, 5);
v2.insert(1, 6);
v2.insert(2, 7);

Vectors sum = v1.add(v2);
sum.display();
    }

}
