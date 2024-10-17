import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result.append(ch);
            }
        }
        System.out.println("The string without vowels is: " + result.toString());
        scanner.close();
    }
}
