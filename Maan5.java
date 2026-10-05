class outer
{
    int factorial(int x)
    {
        int fact = 1;
        int i = 1;
        while(i <= x)
        {
            fact = fact * i;
            i++;
        }
        return fact;
    }
    class Maan5
    {
        public static void main(String args[])
        {
            outer o = new outer();
            int result = o.factorial(5);
            System.out.println("Factorial of 5 is: " + result);
        }
    }
}
