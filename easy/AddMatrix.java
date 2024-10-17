import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the first 2x2 matrix (Mat1):");
        int[][] mat1 = new int[2][2];
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                mat1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of the second 2x2 matrix (Mat2):");
        int[][] mat2 = new int[2][2];
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                mat2[i][j] = scanner.nextInt();
            }
        }
        int[][] matSum = new int[2][2]; 
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                matSum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("The sum of the matrices is:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                System.out.print(matSum[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
