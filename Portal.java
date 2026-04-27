public class Portal {
    double cartValue, finalAmount;
    double discount = 0.0;

    void checkout(double cartValue) {
        this.cartValue = cartValue;
        if (cartValue > 1200) {
            discount = cartValue * 0.25;
        } else {
            discount = cartValue * 0.15;
        }
        finalAmount = cartValue - discount;
        display();

    }

    void checkout(double cartValue, String coupneCode) {
        if (cartValue < 600) {
            discount = 20;
            this.cartValue = cartValue;
        } else if (cartValue >= 600 && coupneCode.equals("SAVE10")) {
            discount = cartValue * 0.10;
        } else {
            discount = 0.0;
            System.out.println("Invalid coupn code");
        }
        finalAmount = cartValue - discount;
        display();

    }

    void display() {
        System.out.println("Original cart value:" + cartValue);
        System.out.println("The discount:" + discount);
        System.out.println("The final payable amount:" + finalAmount);

    }

    public static void main(String[] args) {
        Portal p1 = new Portal();
        Portal p2 = new Portal();
        p1.checkout(1233);
        p1.checkout(600, "SAVE10");
        p2.checkout(456);
        p2.checkout(650, "INVALID");

    }

}
