public class Billing {

    public void computeBill(double price) {
        double total = price + (price * 0.08);
        System.out.println("The total price for the bill is: $" + total);
    }

    public void computeBill(double price, int quantity) {
        double total = (price * quantity) + (price * quantity * 0.08);
        System.out.println("The total price for the bill is: $" + total);
    }

    public void computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discount = subtotal * (couponDiscount / 100.0);
        double total = (subtotal - discount) + ((subtotal - discount) * 0.08); 
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void main(String[] args) {
        Billing bill = new Billing();

        bill.computeBill(23.2);                        
        bill.computeBill(23.2, 3);                     
        bill.computeBill(23.2, 3, 10);                
}

