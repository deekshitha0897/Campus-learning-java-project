import java.util.Scanner;

class User 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter voter ID status: ");
        java.lang.String voterId = scanner.nextLine();

        if (age >= 18)
        {
            System.out.println("user has valid age and voter ID");
        }
        else
        {
            System.out.println("user dont have valid age and voted ID");
        }

        scanner.close();
    }
    
}
