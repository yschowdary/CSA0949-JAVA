import java.util.Scanner;
  public class strtoint
 {
   public static void main(String a[])
   {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a string:");
    String input = scanner.nextLine();
    try{
        int number = Integer.parseInt(input);
        System.out.println("converted integer:" + number);
    }
     catch (NumberFormatException e)
     {
        System.out.println("invalid input!");
     }
     scanner.close();
   }  
}
