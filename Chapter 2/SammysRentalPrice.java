import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.print("Enter Number of Minutes: ");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int extraMinutes = minutes % 60;
        int rentalCost;

        if (minutes < 60) {
            rentalCost = 40;
        } else {
            rentalCost = (hours * 40) + extraMinutes;
        }

        System.out.println("Hours: " + hours);
        System.out.println("Extra Minutes: " + extraMinutes);
        System.out.println("Rental Cost: $" + rentalCost);

        scanner.close();
    }
}
