import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String: ");
        String inputString = scanner.nextLine();
        String reversedString = new StringBuilder(inputString).reverse().toString();

        if(inputString.equalsIgnoreCase(reversedString)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
