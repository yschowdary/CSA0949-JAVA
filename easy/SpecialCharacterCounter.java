import java.util.Scanner;

public class SpecialCharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();
        StringBuilder specialCharacters = new StringBuilder();
        int specialCharCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharacters.append(ch);
                specialCharCount++;
            }
        }
        System.out.println("Special characters: " + specialCharacters);
        System.out.println("Number of special characters: " + specialCharCount);
        scanner.close();
    }
}
