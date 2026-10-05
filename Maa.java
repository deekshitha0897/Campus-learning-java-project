interface b
{
    int x = 20;
    public void display();
    
}
class abc implements b
{
    public void display()
    {
        System.out.println("hi I am from interface");
    }
}
class Maa
{
    public static void main(String args[])
    {
        abc obj = new abc();
        obj.display();
        System.out.println(b.x);
    }
}
