import java.util.Scanner;
class Matrix3x3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int [3][3];
        System.out.println("Enter the elements for a 3x3 matrix (9 integers):");
        for (int i =0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }    
        }    
        System.out.println("\n the 3x3 Matrix is :");
        for (int i = 0; i < 3; i++)  
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print( matrix[i][j] + "/t " );
                
            }
            System.out.println();
        }    
        sc.close();
    }
}
