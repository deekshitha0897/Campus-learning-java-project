import java.util.Scanner;
class Stu 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try {
            int Studentrollno = 40021;
            System.out.println("enter the Sturollno");
            Studentrollno = sc.nextInt();
            java.lang.String s = "John";
            System.out.println("enter the s");
            s = sc.nextLine();
            char gender = 'F';
            System.out.println("enter the gender");
            gender = sc.next().charAt(0);
            int marks = 499;
            System.out.println("enter the marks");
            marks = sc.nextInt();
        } finally {
            sc.close();
        }
    }
    
}
