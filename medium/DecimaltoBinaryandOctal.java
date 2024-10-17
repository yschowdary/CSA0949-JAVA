import java.util.Scanner;

public class DecimaltoBinaryandOctal {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimalNumber;
        try {
            decimalNumber = Integer.parseInt(scanner.nextLine(), 10);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please enter a valid decimal number.");
            return;
        }
        String binary = Integer.toBinaryString(decimalNumber);
        String octal = Integer.toOctalString(decimalNumber);
        System.out.println("Binary Number = " + binary);
        System.out.println("Octal Number = " + octal);

        scanner.close();
    }
}