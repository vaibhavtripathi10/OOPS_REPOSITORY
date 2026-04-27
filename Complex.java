public class Complex {
    private double real;
    private double img;

    public Complex(double real, double img){
        this.real = real;
        this.img = img;
    }

    public double getReal(){
        return this.real;
    }

    public void setReal(double real){
        this.real = real;
    }

    public double getImg(){
        return this.img;
    }

    public void setImg(double img){
        this.img = img;
    }

    Complex add(Complex other){
        double newreal = this.real + other.getReal();
        double newimg = this.img + other.getImg();
        return new Complex(newreal, newimg); 
    }

    Complex scale(double factor){
        double newreal = this.real * factor;
        double newimg = this.img * factor;
        return new Complex(newreal, newimg);
    }

    void display(){
        if (img >= 0)
            System.out.println(real + " + " + img + "i");
        else
            System.out.println(real + " - " + (-img) + "i");

        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3.5, 4.3);
        Complex c2 = new Complex(4.2, 9.1);

        // Using setters
        c1.setReal(3.5);
        c1.setImg(4.3);

        c2.setReal(4.2);
        c2.setImg(9.1);

        System.out.println("Complex Number 1:");
        c1.display();

        System.out.println("Complex Number 2:");
        c2.display();

        System.out.println("After Addition:");
        Complex sum = c1.add(c2);
        sum.display();

        System.out.println("After Scaling:");
        Complex scaled = c1.scale(4.0);
        scaled.display(); 
    }
}
