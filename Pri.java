import java.util.*;
class Pri
{
    public static void main(String args[])
    {
        int no,count,temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("pls enter the range");
        no= sc.nextInt();
        for(int i=2; i<=no; i++)
        {
            count= 0;
            for(int j =1; j<=i; j++)
            {
                if (i%j== 0) 
                count++;    
                    
                
            }
            if(count == 2)
                System.out.print(i+" ");    
        }
        sc.close();
    }
}