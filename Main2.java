class Greet
{
     void sayHello(java.lang.String name)// takes a parameter
    {
           System.out.println("Hello,  " + name + "!");
    }
}

public class Main2
{
     public static void main(String args[])
     {
          Greet g = new Greet();
          g.sayHello((java.lang.String) "Riya");
     }
}