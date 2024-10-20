import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.println("enter the number:");
     int n = scan.nextInt();
     int reverse = 0;
     while (n!=0) {
      int digit=n%10;
      reverse=reverse*10+digit;
      n/=10;
     }
     System.out.println("reversed number:"+reverse);
     scan.close();
    }
}
