import java.util.Scanner;

public class Rectanglepattern 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scan.nextInt();
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        scan.close();
    }
}
