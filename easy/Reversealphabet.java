import java.util.Scanner;
import java.util.Arrays;

public class Reversealphabet 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine().toUpperCase();
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        System.out.print("Alphabetical Order: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
        scanner.close();
    }
}