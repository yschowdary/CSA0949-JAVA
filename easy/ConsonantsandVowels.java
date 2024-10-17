import java.util.Scanner;

public class ConsonantsandVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Word: ");
        String word = scanner.nextLine().toLowerCase();
        StringBuilder consonants = new StringBuilder();
        StringBuilder vowels = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.append(ch).append(" ");
            } else if (Character.isLetterOrDigit(ch)) {
                consonants.append(ch).append(" ");
            }
        }
        System.out.println("Consonants: " + consonants.toString());
        System.out.println("Vowels: " + vowels.toString());

        scanner.close();
    }
}