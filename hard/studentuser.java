import java.util.Scanner;

public class studentuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Total Users: ");
        int totalUsers = scanner.nextInt();

        System.out.print("Enter the Staff Users: ");
        int staffUsers = scanner.nextInt();

        int nonTeachingStaffUsers = staffUsers / 3;

        int totalStaffUsers = staffUsers + nonTeachingStaffUsers;

        int studentUsers = totalUsers - totalStaffUsers;

        System.out.println("Student Users: " + studentUsers);

        scanner.close();
    }
}

