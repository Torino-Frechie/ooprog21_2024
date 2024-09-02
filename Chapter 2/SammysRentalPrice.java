import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        int hourlyRate = 40;
        int minutesInHour = 60;

        Scanner input = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("* Sammy’s makes it fun in the sun. *");
        System.out.println("***********************************");

        System.out.print("Enter minutes rented: ");
        int totalMinutes = input.nextInt();

        int hours = totalMinutes / minutesInHour;
        int extraMinutes = totalMinutes % minutesInHour;

        int totalCost = (hours * hourlyRate) + extraMinutes;

        System.out.println("Total price: $" + totalCost);
        
        input.close();
    }
}
