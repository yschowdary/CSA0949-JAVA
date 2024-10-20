import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number: ");
        int m = scanner.nextInt();
        
        for (int i = 1; i <= m; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();  
        }
        
        for (int i = m - 1; i >= 1; i--) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();  
        }
        
        scanner.close();
    }
}

