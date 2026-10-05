class AddMat
{
    public static void main(String args[])
    {
        int rows = 2, columns = 2;
        int[][] firstMatrix = { {2,3}, {5,2} };
        int[][] secondMatrix = { {-4,5}, {5,6} };
        int [][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("Sum of two matrices is: ");
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