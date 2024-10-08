import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        String[] names = new String[n];
        System.out.println("Enter the names: ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }        
        System.out.print("Order (A for Ascending, D for Descending): ");
        char order = scanner.nextLine().toUpperCase().charAt(0);
        Arrays.sort(names);
        if (order == 'D') {
            for (int i = 0; i < names.length / 2; i++) {
                String temp = names[i];
                names[i] = names[names.length - 1 - i];
                names[names.length - 1 - i] = temp;
            }
        }
        System.out.println("Sorted names: ");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}