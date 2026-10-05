import java.util.Scanner;

class Or 
 { 
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = scanner.nextInt();

        if (no % 2 == 0)
        {
            System.out.println(no + " is even");
        }
        else 
        {
            System.out.println(no + " is odd");
        }

        scanner.close();
    }
    
}
