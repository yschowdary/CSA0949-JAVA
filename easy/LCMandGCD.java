import java.util.Scanner;

public class LCMandGCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of values (N): ");
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            int gcd = numbers[0];
            int lcm = numbers[0];

            for (int i = 1; i < n; i++) {
                gcd = findGCD(gcd, numbers[i]);
                lcm = findLCM(lcm, numbers[i]);
            }

            System.out.println("LCM = " + lcm);
            System.out.println("GCD = " + gcd);
        }
    }
}
