class Mat2
{
    public static void main(String args[])
    {
        int[][] matrix = new int [2][2];
        matrix[0][0] = 10;
        matrix[0][1] = 20; 
        matrix[1][0] = 30;
        matrix[1][1] = 40;  
        System.out.println("The 2x2 Matrix is :");
        System.out.println(matrix[0][0] + " " + matrix[0][1]);
        System.out.println(matrix[1][0] + " " + matrix[1][1]);
    }
}