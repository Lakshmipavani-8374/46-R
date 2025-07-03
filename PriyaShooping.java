public class priyaShooping {
    public static void main(String[] args) {
        double amount = 12000;
        boolean isMember = true;
        double discount = 0;
        if (isMember) {
            if (amount >= 10000)
                discount = 0.30;
            else if (amount >= 5000)
                discount = 0.20;
            else
                discount = 0.05;
        } else {
            discount = 0.05;
        }
        double finalAmount = amount - (amount * discount);
        System.out.println("Final amount: Rs." + finalAmount);
    }
 }