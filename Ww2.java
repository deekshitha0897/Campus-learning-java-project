 class Add 
 {
    int addition()
    {
        int x=10; int y=20;
        int sum= x+y;
        return sum;
    }
}
    
class Sub
{
    int subtraction()
    {
        int x=10; int y=20;
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
        int x=alam.addition();
        int y=belam.subtraction();
        System.out.println("the addition is="+x);
        System.out.println("the subtraction is="+y);
    }
}
