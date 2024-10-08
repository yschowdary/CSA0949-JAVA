import java.util.Scanner;

public class username
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
    {
      String s1 = input.nextLine();
      String s2 = input.nextLine();
      if(s1==s2)
      {
        System.out.println("username is valid");
      }
      else
      {
        System.out.println("username is invalid");
      }
    }
    }
}