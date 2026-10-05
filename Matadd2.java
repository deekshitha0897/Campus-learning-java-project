import java.util.Scanner;

class Matadd2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] matrix = new int[2][2];

        System.out.println("Enter Matrix 1:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix 2:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


 
