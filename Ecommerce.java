public class Ecommerce {
    double cartValue, finalAmount;
    double discount = 0.0;
    double gstAmount;

    void checkout(double cartValue) {
        this.cartValue = cartValue;
        if (cartValue >= 1200) {
            discount = 0.25 * cartValue;

        } else {
            discount = 0.15 * cartValue;

        }
        finalAmount = cartValue - discount;
        System.out.println("The customer is premium");
        gst();
    }

    void checkout(double cartValue, String coupneCode) {
        this.cartValue = cartValue;
        System.out.println("The customer is standard:");
        if (cartValue <= 600 && coupneCode == "RUNNING") {
            discount = 20;
            finalAmount = cartValue - discount;
        } else if (cartValue >= 600 && coupneCode == "SAVE10") {
            discount = cartValue * 0.10;

        } else {
            System.out.println("Invalid coupn code");
        }
        finalAmount = cartValue - discount;
        gst();

    }

    void display() {

        System.out.println("The original cart value:" + cartValue);
        System.out.println("The discount applied:" + discount);
        System.out.println("The GST amount:" + gstAmount);
        System.out.println("The final payable amount:" + finalAmount);
        System.out.println("----------------------------");
    }

    void gst() {
        gstAmount = (cartValue - discount) * 0.18;
        finalAmount = finalAmount + gstAmount;
        display();
    }

    public static void main(String[] args) {
        Ecommerce e1 = new Ecommerce();
        e1.checkout(1200);
        e1.checkout(400, "SAVE10");
        e1.checkout(600, "INVALID");
        e1.checkout(599, "RUNNING");
    }

}
