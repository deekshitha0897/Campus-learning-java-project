import java.util.Scanner;
class AddMat2 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the matrices:");
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];
        System.out.println("Enter the first matrix"+ rows + "x" + columns + " values:");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                firstMatrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the second matrix"+ rows + "x" + columns + " values:");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                secondMatrix[i][j] = s.nextInt();
            }
        }
        s.close();
        int [][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}        