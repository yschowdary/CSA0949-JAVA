import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of perfect numbers to find (N): ");
        int N = scanner.nextInt();
        int count = 0;  
        int number = 1; 
        while (count < N) {
            if (isPerfect(number)) {
                System.out.print(number + " ");
                count++;  
            }
            number++;  
        }
        scanner.close();
    }
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}

