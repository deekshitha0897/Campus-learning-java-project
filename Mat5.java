class Mat5 {
    public static void main(String[] args) 
    {
        int rows = 2;
        int columns = 2;
        int[][] firstMatrix = { {-5,4}, {8,4}};
        int[][] secondMATRIX = { {5,7}, {7,7}};
        int [][] sum =  new int[rows][columns];
        for (int i =0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                sum[i][j] = firstMatrix[i][j] + secondMATRIX[i][j];
                
             }
        }
        System.out.println("Sum of two matrices is: ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
