import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        HashSet<Integer> uniqueItems = new HashSet<>();
        for (int num : array) {
            uniqueItems.add(num);
        }
        
        Integer[] resultArray = uniqueItems.toArray(new Integer[0]);
        
        System.out.println("Non-duplicate items:");
        System.out.println(Arrays.toString(resultArray));
        
        scanner.close();
    }
}
