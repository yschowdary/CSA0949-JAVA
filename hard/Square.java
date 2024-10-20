import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the lower range: ");
            int lowerRange = scanner.nextInt();

            System.out.print("Enter the upper range: ");
            int upperRange = scanner.nextInt();
            List<int[]> results = new ArrayList<>();
            for (int i = lowerRange; i <= upperRange; i++) {
                results.add(new int[]{i, i * i}); 
            }
            System.out.print("[");
            for (int i = 0; i < results.size(); i++) {
                int[] pair = results.get(i);
                System.out.print("(" + pair[0] + ", " + pair[1] + ")");
                if (i < results.size() - 1) {
                    System.out.print(", ");
                }
            }
        }

        System.out.print("]");
    }
}
