import java.util.Scanner;

public class BinaryConverter {

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);  
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number (Binary): ");
        String binary = scanner.next();
        
        int decimal = binaryToDecimal(binary);
        
        String octal = decimalToOctal(decimal);
        
        System.out.println("Decimal Number: " + decimal);
        System.out.println("Octal: " + octal);
        
        scanner.close();
    }
}
