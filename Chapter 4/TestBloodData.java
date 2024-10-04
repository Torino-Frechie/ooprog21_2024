import java.util.Scanner;

public class TestBloodData {
    private String bloodType;
    private String rhFactor;

    public TestBloodData() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    public TestBloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Blood Type: ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh Factor: ");
        String rhFactor = scanner.nextLine();

        TestBloodData patient = new TestBloodData(bloodType, rhFactor);
        patient.displayBloodInfo();

        scanner.close();
    }
}
