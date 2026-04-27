import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name:");
        String name = sc.next();
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        System.out.println("Hello bhisdiwale:" + name);
        System.out.println("Your age:" + age);
        sc.close();

    }

}
