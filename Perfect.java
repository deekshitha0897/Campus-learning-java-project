import java.util.*;
class Perfect 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("print a number");
        int no = sc.nextInt();
        
        if(no == 0)
        System.out.println("it is a perfect number");
        else
        System.out.println("it is not a perfect number");
        
        sc.close();
    }
    
}
