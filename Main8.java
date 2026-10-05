class sec
{
    int count;
    String s;
    sec()
    {
        System.out.println("hi this is default constructor");
    }
    sec(int count, String s)
    {
        this.count = count;
        this.s = s;
        System.out.println("the count = "+ this.count);
        System.out.println("the string = "+ this.s);
    }
}
public class Main8
{
    public static void main(String args[])
    {
        sec obj = new sec(100, "section - 5");
        sec obj2 = new sec();
    }
}
    

