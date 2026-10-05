public class Armstrong 
{
    public static void main(String[] args) 
    {
        int no = 407;
        int temp = no;
        int sum = 0;

        while (temp > 0) 
        {
            int digit = temp % 10;
            sum += (digit * digit * digit);
            temp /= 10;
        }

        if (sum == no)
            System.out.println(no + " is an Armstrong number.");
        else
            System.out.println(no + " is not an Armstrong number.");
    }
}
