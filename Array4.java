 class Array4 
 {
    public static void main(String args[])
    {
        int[] marks = {80, 75, 90, 85, 70};
        int target = 90;
        for (int i = 0; i < marks.length; i++)
        {
            if (marks[i] == target)
            {
                System.out.println("Found target marks at index: " + i);
                return;
            }
        }
        System.out.println("Target marks not found.");
    }
    
}
