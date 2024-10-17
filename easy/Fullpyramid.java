import java.util.Scanner;

public class Fullpyramid 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j < rows; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

