class Fibo
{
      public static void main(String args[])
      {
              int no=10,a=0,b=1,c;
              System.out.println("the fibonacci series is");
              System.out.print(a+" "+b+" ");
              c=a+b;
              while (c<=no)
              {
                System.out.print(c+" ");
                a=b;
                b=c;
                c=a+b;
              }
      }
}
                     