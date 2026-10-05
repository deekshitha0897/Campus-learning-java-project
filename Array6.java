 class Array6 
 {
    public static void main(String args[])
    {
        int[] marks = {80, 75, 90, 85, 70};
        int max = marks[0];
        for (int i = 1; i < marks.length; i++)
        {
            if (marks[i] > max)
            {
                max = marks[i];
            }
        }
        System.out.println("Maximum marks = " + max);
    }
    
}
