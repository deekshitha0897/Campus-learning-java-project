import java.util.Scanner;

public class H1A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of family members:");
        int familyMembers = scanner.nextInt();
        System.out.print("Enter water consumed in liters:");
        double waterConsumed = scanner.nextDouble();
        System.out.print("Enter house number:");
        int houseNumber = scanner.nextInt();
        System.out.print("Enter water usage status:"); 
        String waterUsageStatus = scanner.next();

        System.out.println("Household Details:");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed in liters: " + waterConsumed);
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterUsageStatus);

        scanner.close();
    }
}