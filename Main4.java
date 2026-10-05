class MathUtil
{
    static int add(int a, int b)
    {
          return a+b;
    }
}
public class Main4
{
     public static void main(String args[])
     {
         int result = MathUtil.add(5,7);
         System.out.println("Sum: " + result);
     }
}