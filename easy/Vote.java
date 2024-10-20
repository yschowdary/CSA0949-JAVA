import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = scan.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                int yearsLeft = 18 - age;
                System.out.println("You are allowed to vote after " + yearsLeft + " years.");
            }
        }
    }
}
