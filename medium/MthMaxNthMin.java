import java.util.Arrays;
import java.util.Scanner;

public class MthMaxNthMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {14, 16, 87, 36, 25, 89, 34};
        System.out.print("Enter the value of M (for Mth maximum): ");
        int M = scanner.nextInt();
        System.out.print("Enter the value of N (for Nth minimum): ");
        int N = scanner.nextInt();
        Arrays.sort(array);
        int nthMin = array[N - 1]; 
        int mthMax = array[array.length - M]; 
        System.out.println(M + "th Maximum Number = " + mthMax);
        System.out.println(N + "th Minimum Number = " + nthMin);
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        scanner.close();
    }
}
