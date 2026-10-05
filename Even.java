

// program to print all even numbers from 1 to 100
class Even
{
       public static void main(String args[])
       {
              int no=100,i=2;
              while(i<=no)
              {
                      if(i%2==0)
                      {
                             System.out.print("  "+i);
                      }
                      i=i+1;
              }
       }
}