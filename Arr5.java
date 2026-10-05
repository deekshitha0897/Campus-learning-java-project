import java.util.*;
class Arr5 
{
    public static void main(String args[])
    {
        int a[]=new int[10],no,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("pls enter the range of array");
        no=sc.nextInt();
        for(i=0;i<no;i++)
        {
            System.out.println("pls enter the index of a["+i+"]");
            a[i]=sc.nextInt();
        }
        System.out.println("the array elements are");
        for(i=0;i<no;i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }   
}
