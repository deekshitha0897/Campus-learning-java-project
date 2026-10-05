import java.util.Scanner;
class Value
{
    public static void main(String args[])
    {
               try (Scanner sc = new Scanner(System.in)) {
                      int a,b,opt;
                      System.out.println("1.ADD  2.SUB  3.MUL");
                      System.out.println("enter your option");
                      opt = sc.nextInt();
                      System.out.println("enter a and b values");
                      a= sc.nextInt();
                      b= sc.nextInt();
                      switch(opt)
                      {
                case 1 : 
                       System.out.println("the addition is="+(a+b));
                       break;
                case 2 : 
                       System.out.println("the subtraction is="+(a-b));
                       break;
                case 3 : 
                       System.out.println("the multiplication is="+(a*b));
                       break;
                default: 
                       System.out.println(" pls enter the valid option");
                       break;
                      }
               }
    }
}
