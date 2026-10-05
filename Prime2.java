import java.util.*;
class Prime2 
 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int no, i=1, count =0 ;
        System.out.println("pls enter the number");
        no = sc.nextInt();
        for(i=1; i<=no;i++)
        {
              if(no%i==0)
              count= count +1;

        }  
        if(count==2)
        System.out.println("the entered number " + no + " is prime");
        else
        System.out.println("the entered number " + no + " is not prime");

        sc.close();

    }
    
}
