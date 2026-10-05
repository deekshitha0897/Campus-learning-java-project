import java.util.Scanner;
class Age 
 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age>18)
        {
           System.out.println(age + " is eligible to vote");
        }
    
        else if (age<18)
        {
            System.out.println(age + " is not eligible to vote");
        }

        scanner.close();
    }
    
}
