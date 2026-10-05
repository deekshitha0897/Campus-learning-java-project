import java.util.Scanner;

class Char 
 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);

        if (gender == 'M') 
        {
            System.out.println("Gender: Male");
        }
        else if (gender == 'F') 
        {
            System.out.println("Gender: Female");
        }
        else 
        {
            System.out.println("Invalid gender");
        }

        scanner.close();
    }
    
}
