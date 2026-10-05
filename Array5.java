class Array5 
{
    public static void main(String args[])
    {
        int[] marks = {80, 35, 90, 20, 70};
        int count = 0;
        for (int i = 0; i < marks.length; i++)
        {
            if (marks[i] < 40)
            {
                count++;
            }
        }
        System.out.println("Number of students who failed: " + count);
    }
    
}
