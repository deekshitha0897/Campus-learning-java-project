 import java.util.Scanner;

class Matadd3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int matrix[][] = new int[3][3];

        System.out.println("Enter Matrix 1:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix 2:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Result:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}