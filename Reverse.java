 class Reverse 
 {
    public static void main(String args[])
    {
        int no=123,rev=0;
        while(no>0)
        {
            rev=rev*10+no%10;
            no=no/10;
        }
        System.out.println("The reverse of the number is: "+rev);
    }
}
