import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements (N): ");
            int N = scanner.nextInt();
            int[] numbers = new int[N];
            System.out.println("Enter " + N + " numbers:");
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            try {
                for (int i = 0; i <= N; i++) {
                    sum += numbers[i]; 
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            }
            System.out.println("Sum of the numbers is: " + sum);
        }
    }
}
