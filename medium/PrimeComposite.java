import java.util.Scanner;

public class PrimeComposite {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, not prime
            }
        }
        return true; // No factors found, it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeCount = 0;
        int compositeCount = 0;

        System.out.println("Enter the numbers (enter a negative number to stop):");

        while (true) {
            int num = scanner.nextInt();

            if (num < 0) {
                break; // Stop input on negative number
            }

            if (num > 1 && !isPrime(num)) {
                compositeCount++; // Count composite numbers
            } else if (isPrime(num)) {
                primeCount++; // Count prime numbers
            }
        }

        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);

        scanner.close();
    }
}

