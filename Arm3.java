
import java.util.Scanner;

public class Arm3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");
        int end = sc.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        boolean found = false;

        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Armstrong numbers found in the given range.");
        }

        sc.close();
    }

    static boolean isArmstrong(int number) {
        int original = number;
        int digits = 0;

        // Count digits
        while (original != 0) {
            digits++;
            original /= 10;
        }

        original = number;
        int sum = 0;

        // Sum of each digit raised to power of digit count
        while (original != 0) {
            int digit = original % 10;
            sum += Math.pow(digit, digits);
            original /= 10;
        }

        return sum == number;
    }
}
    

