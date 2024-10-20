import java.util.Scanner;

public class SpecialCharacter {
    
    public static int countSpecialCharacters(String statement) {
        int specialCharCount = 0;
        
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }
        
        return specialCharCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Given statement: ");
        String statement = scanner.nextLine();
        
        int specialCharCount = countSpecialCharacters(statement);
        
        System.out.println("Number of special Characters: " + specialCharCount);
        
        scanner.close();
    }
}
