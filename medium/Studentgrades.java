import java.util.Scanner;

public class Studentgrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int python, cProgramming, mathematics, physics;
        System.out.print("Enter the marks in Python: ");
        python = scanner.nextInt();

        System.out.print("Enter the marks in C Programming: ");
        cProgramming = scanner.nextInt();

        System.out.print("Enter the marks in Mathematics: ");
        mathematics = scanner.nextInt();

        System.out.print("Enter the marks in Physics: ");
        physics = scanner.nextInt();
        
        int total = python + cProgramming + mathematics + physics;
        System.out.println("Total = " + total);
        double aggregate = total / 4.0;
        System.out.println("Aggregate = " + aggregate);
        if (aggregate >= 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
        scanner.close();
    }
}
