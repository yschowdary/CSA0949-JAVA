import java.util.Scanner;

public class DecimaltoBinaryReverse {
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public static int decimalToBinaryReverse(int num) {
        String binaryString = Integer.toBinaryString(num);
        System.out.println("Binary representation of " + num + ": " + binaryString);
        
        String reversedBinary = reverseString(binaryString);
        System.out.println("Reversed binary: " + reversedBinary);

        return Integer.parseInt(reversedBinary, 2);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a decimal number: ");
            int num = scanner.nextInt();

            int reversedDecimal = decimalToBinaryReverse(num);
            System.out.println("Reversed binary as decimal: " + reversedDecimal);
        }
    }
}
