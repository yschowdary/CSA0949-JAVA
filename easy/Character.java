import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to be searched: ");
        char searchChar = scanner.next().charAt(0);
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchChar) {
                System.out.println(searchChar + " is found in string at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(searchChar + " is not found in the string.");
        }
        scanner.close();
    }

    public static boolean isLetterOrDigit(char ch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLetterOrDigit'");
    }

    public static boolean isWhitespace(char ch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isWhitespace'");
    }
}