import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.print("\nEnter Number of Minutes: ");
        int minutes = input.nextInt();

        int hours = minutes / 60;
        int extraMinutes = minutes % 60;
        int totalCost = (hours * 40) + extraMinutes;

        if (totalCost < 40) {
            totalCost = 40;
        }
        System.out.println("Rental Cost: $" + totalCost);
    }
}
