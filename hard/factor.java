import java.util.ArrayList;
import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("Number of factors = " + factors.size());

        if (N <= factors.size()) {
            System.out.println(N + "th factor of " + number + " = " + factors.get(N - 1));
        } else {
            System.out.println("Invalid input: N is greater than the number of factors.");
        }

        scanner.close();
    }
}
