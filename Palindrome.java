import java.util.Scanner;

class Palindrome
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int reverse = 0;

        while (number > 0)
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original == reverse)
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");

        scanner.close();
    }
}
