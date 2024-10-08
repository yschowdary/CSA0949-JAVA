import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of days
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Calculate the number of years, weeks, and remaining days
        int years = totalDays / 365;            // 1 year = 365 days
        int remainingDaysAfterYears = totalDays % 365;

        int weeks = remainingDaysAfterYears / 7; // 1 week = 7 days
        int remainingDays = remainingDaysAfterYears % 7;

        // Output the result
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + remainingDays);

        scanner.close();
    }
}
