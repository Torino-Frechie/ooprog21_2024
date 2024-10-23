import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        scanner.close();
        
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);
        } else {
            int[] numbers = {num1, num2, num3};
            sortDescending(numbers);
            System.out.println("Numbers in descending order: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
        }
    }
    
    public static void sortDescending(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
