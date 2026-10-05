import java.util.Scanner;
public class LockerRouter 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int longside = sc.nextInt();
        double weight = sc.nextDouble();
        char tier;
        if (longside <= 20 && weight <=2.0) {
            tier = 'S';
        }else if (longside <= 40 && weight <= 5.0){ 
            tier = 'M';
        }else if (longside <= 60 && weight <= 10.0){
             tier = 'L';
        }else {
            tier = 'X';
        }
         System.out.println(tier);
        sc.close();
    }
    
}
