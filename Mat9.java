 class Mat9 
 {
    public static void main(String args[])
    {
        int a = 10, b = 0;
        int x[] = new int[3];
        try
        {
            x[3] = 500;
            int c = a/b;
        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(obj);
        }
        System.out.println("after try and catch");
    }
    
}
