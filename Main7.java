class sec
{
    int count;
    String s;
    sec()
    {
        System.out.println("hi thid is default constructor");
    }
    sec(int x, String y)
    {
        count = x;
        s = y;
        System.out.println("the count = "+ count);
        System.out.println("the string = "+ s);
    }
}
public class Main7
{
    public static void main(String args[])
    {
        sec obj = new sec(100, "section - 5");
        sec obj2 = new sec();
    }
}