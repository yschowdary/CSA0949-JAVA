import java.util.Scanner;

public class MulMatrix {
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
        int[][] matResult = new int[2][2]; 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) 
            {
                matResult[i][j] = 0;
                for (int k = 0; k < 2; k++) 
                {
                    matResult[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("The product of the matrices is:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                System.out.print(matResult[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
