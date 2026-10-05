import java.util.Scanner;
class H1C
{
    public static int CalculateTotalConsumption(int morningUsage, int eveningUsage)
    {
        int totalConsumption = morningUsage + eveningUsage;
        return totalConsumption;
        
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter morning water usage in liters: ");
        int morningUsage = s.nextInt();
        System.out.print("Enter evening water usage in liters: ");
        int eveningUsage = s.nextInt();
        int totalConsumption = H1C.CalculateTotalConsumption(morningUsage, eveningUsage);
        System.out.println("Total water consumption: " + totalConsumption + " liters");
        s.close();
    }
}
