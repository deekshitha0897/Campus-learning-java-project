 import java.util.Scanner;
class Input
  {
    public static void main(String args[])
    {
      try(Scanner s5=new Scanner(System.in))
      {
        int no;
        double d;
        java.lang.String s;
        System.out.println("enter the string");
        s=s5.nextLine();
        System.out.println("enter the number");
        no=s5.nextInt();
        System.out.println("enter the double");
        d=s5.nextDouble();
        System.out.println(no);
        System.out.println(d);
        System.out.println(s);
      }
    }
    
}
