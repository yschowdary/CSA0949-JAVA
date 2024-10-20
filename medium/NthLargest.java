import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {
    
    public static int findNthLargest(int[] arr, int N) {
        Arrays.sort(arr);
        
        return arr[arr.length - N];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        if (N > 0 && N <= size) {
            int nthLargest = findNthLargest(array, N);
            System.out.println(N + "th Largest number: " + nthLargest);
        } else {
            System.out.println("Invalid input for N!");
        }
        
        scanner.close();
    }
}
