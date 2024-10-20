import java.util.Scanner;

public class SimpleIntrest {

    public static double calculateSimpleInterest(double principal, double rate, int years) {
        return (principal * rate * years) / 100;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the number of years: ");
            int years = scanner.nextInt();

            System.out.print("Is the customer a senior citizen (y/n): ");
            char isSeniorCitizen = scanner.next().charAt(0);

            double rateOfInterest = (isSeniorCitizen == 'y' || isSeniorCitizen == 'n') ? 12.0 : 10.0;

            double interest = calculateSimpleInterest(principal, rateOfInterest, years);

            System.out.println("Interest: " + interest);
        }
    }
}
