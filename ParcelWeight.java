import java.util.Scanner;
class ParcelWeight
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.println("Enter parcel weight");
            double weight = Double.parseDouble(s.nextLine());
            System.out.println("Weight accepted " + weight + "kg");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid weight" + "Please enter a number");
        }
        finally
        {
            System.out.println("Weight checking completed");
            s.close();
        }
    }
}