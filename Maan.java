class Add
{
    int addition(int x, int y )
    {
        int sum= x+y;
        return sum;
    }
}
    
class Sub
{
    int subtraction(int x, int y)
    {
        int m =x-y;
        return m;
    }
}
class Maan
{
    public static void main(String args[])
    {
        System.out.println("hi this is section-5");
        Add alam= new Add();
        Sub belam= new Sub();
        int x=alam.addition(10,20);
        int y=belam.subtraction(10,20);
        System.out.println("the addition is="+x);
        System.out.println("the subtraction is="+y);
    }
    
}

