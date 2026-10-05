 class first
 {
    int a = 200;
    void disp1()
    {
        System.out.println(a);
    }
 }
 class second extends first
 {
    int b = 400;
    void disp2()
    {
        System.out.println(b);
    }
 }
 class third extends second
 {
    int c = 500;
    void disp3()
    {
        System.out.println(c);
    }
 }
 class MutliL
 {
    public static void main(String args[])
    {
        third t = new third();
        t.disp1();
        t.disp2();
        t.disp3();
    }
 }
