import java.util.Scanner;  

class H1B
{
    public static void main(String args[])
    {
Scanner s = new Scanner(System.in);
System.out.print("Enter water consumed in liters: ");
double waterConsumed = s.nextDouble();
int bill;
if(waterConsumed <= 500)
{
    bill = 100;
}
else
{
    bill = 200;
}
System.out.println("Water bill: " + bill);

s.close();
    }
}

