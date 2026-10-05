 class Mat8 
{
    public static void main(String args[])
    {
        int a = 10, b = 0;
        int x[] = new int[3];
        try
        {
            x[3] = 500;
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
        System.out.println("after try and catach");
    }
    
}
