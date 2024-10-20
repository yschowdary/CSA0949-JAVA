import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        
        System.out.print(first + " " + second);
        
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive number.");
            } else {
                System.out.println("Fibonacci series up to " + n + " terms:");
                printFibonacci(n);
            }
        }
    }
}
