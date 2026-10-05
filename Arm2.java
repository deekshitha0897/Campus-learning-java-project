 import java.util.Scanner;
 class Arm2 
 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("print a number");
      int no = sc.nextInt();
       int temp = no;
       int sum = 0;

       while(temp>0)
       {
        int digit =  temp % 10;
        sum+= (digit * digit * digit);
        temp /= 10;
       } 
      if (sum == no)
         System.out.println(no + "is a Armstrong number");
      else
        System.out.println(no + "is not a Armstrong number");   

      sc.close();
    }
   
    
    
}
