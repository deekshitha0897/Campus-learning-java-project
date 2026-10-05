 import java.util.Scanner;
 class Runtype 
 {
    public static void main(String args[])
    {
        try(Scanner s=new Scanner(System.in))
        {
            int a = 5 , b = 10;
            int sum= a + b;
            int sub= a - b;
            int mul= a * b;
            int div= a / b;
            int mod= a % b;
            System.out.println("enter the a");
            a=s.nextInt();
            System.out.println("enter the b");
            b=s.nextInt();
            System.out.println(a);
            System.out.println(b);
            System.out.println("sum="+sum);
            System.out.println("sub="+sub);
            System.out.println("mul="+mul);
            System.out.println("div="+div);
            System.out.println("mod="+mod);

        }
    }
    
}
