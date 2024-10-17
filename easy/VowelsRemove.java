import java.util.Scanner;

public class VowelsRemove 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        String result = removeVowels(input);
        System.out.println("The string without vowels is: " + result);
        scan.close();
    }
    public static String removeVowels(String str) 
    {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
