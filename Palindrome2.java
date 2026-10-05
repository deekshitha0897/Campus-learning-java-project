import java.util.Scanner;

class Palindrome2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = scanner.nextInt();
        int original = no;
        int reverse = 0;

        while (no > 0)
        {
            int digit = no % 10;
            reverse = reverse * 10 + digit;
            no = no / 10;
        }

        if (original == reverse)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");

        scanner.close();
    }
}

