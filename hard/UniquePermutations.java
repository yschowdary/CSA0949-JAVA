import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutations {
    public static void generatePermutations(String prefix, String remaining, Set<String> permutations) {
        if (remaining.length() == 0) {
            permutations.add(prefix);  
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                generatePermutations(prefix + remaining.charAt(i), 
                                     remaining.substring(0, i) + remaining.substring(i + 1), 
                                     permutations);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        String number = scanner.next();
        Set<String> permutations = new HashSet<>();
        generatePermutations("", number, permutations);
        System.out.println("Permutations are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
        
        scanner.close();
    }
}
