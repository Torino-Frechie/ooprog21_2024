import java.util.Scanner;

public class SpoonerismGenerator {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String word1 = getWord("Enter first word: ");
        String word2 = getWord("Enter second word: ");
        
        if (isFirstLetterVowel(word1) || isFirstLetterVowel(word2)) {
            System.out.println("Cannot spoonerize " + word1 + " and " + word2 + " because they start with a vowel.");
            return;
        }

        String spoonerized1 = word2.charAt(0) + word1.substring(1);
        String spoonerized2 = word1.charAt(0) + word2.substring(1);
        
        System.out.println("Spoonerized words: " + spoonerized1 + " " + spoonerized2);
    }

    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean isFirstLetterVowel(String word) {
        char firstLetter = word.charAt(0);
        return firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || 
               firstLetter == 'o' || firstLetter == 'u' || 
               firstLetter == 'A' || firstLetter == 'E' || firstLetter == 'I' || 
               firstLetter == 'O' || firstLetter == 'U';
    }
}
