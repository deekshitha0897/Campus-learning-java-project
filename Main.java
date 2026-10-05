class Greet 
{
    void sayHello()
   {
         System.out.println("Hello, Welcome!");
   }
}

public class Main 
{
     public static void main(String args[])
     {
           Greet g = new Greet();  //must create an object first
           g.sayHello();
     }
}