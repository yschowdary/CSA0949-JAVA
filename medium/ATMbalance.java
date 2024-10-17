import java.util.Scanner;

public class ATMbalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAmount = 0;
        for (int i = 1; i <= 4; i++) 
        {
            System.out.print("Enter the " + i + "st Denomination: ");
            int denomination = scanner.nextInt();
            System.out.print("Enter the " + i + "st Denomination number of notes: ");
            int numberOfNotes = scanner.nextInt();
            totalAmount += denomination * numberOfNotes;
        }
        System.out.println("Total Available Balance in ATM: " + totalAmount);

        scanner.close();
    }
}