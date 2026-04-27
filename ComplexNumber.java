public class ComplexNumber{
double real;
double imaginary;
ComplexNumber(double r,double i){
real = r;
imaginary = i;
}

void addComplex(double r,double i){
real = real+r;
imaginary = imaginary+i;

}
void display(){
    System.out.println(+real+" + "+imaginary+"i");
}
 void displaySum() {
        System.out.print("Sum of Complex Numbers: " + real + " + " + imaginary + "i");
    }
public static void main(String[] args) {
   ComplexNumber c1 = new ComplexNumber(3.0, 4.0);
   ComplexNumber c2 = new ComplexNumber(5.0, 6.0);




   
   System.out.println("The first complex number:");
   
c1.display();


System.out.println("The second complex number:");

c2.display();

System.out.println("The addition of two complex number:");

c1.addComplex(c2.real, c2.imaginary);

c1.displaySum();

}



}