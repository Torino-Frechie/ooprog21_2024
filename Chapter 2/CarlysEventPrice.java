import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pricePerGuest = 35;
        
        System.out.println("*************************************");
        System.out.println("* Carly's makes the food that makes *");
        System.out.println("*           it a party.             *");
        System.out.println("*************************************");
        
        System.out.print("Enter Number of Guests: ");
        int numberOfGuests = scanner.nextInt();
        
        int totalCost = numberOfGuests * pricePerGuest;
        
        System.out.println("Price Per Guest: $" + pricePerGuest);
        System.out.println("Total Cost: $" + totalCost);
        
        boolean isLargeEvent = numberOfGuests >= 50;
        System.out.println("Large Event: " + isLargeEvent);
        
        scanner.close();
    }
}
