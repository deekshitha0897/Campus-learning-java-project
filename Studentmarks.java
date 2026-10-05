 class Studentmarks 
 {
    public static void main(String args[])
    {
        int[] marks = {70, 45, 80, 35, 90};
        // 1. Travansal - print all the marks
        System.out.println("Student marks:");
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        //2.Search - find 80
        int search = 80;
        for (int i = 0; i < marks.length; i++)
        {
            if (marks[i] == search)
            {
                System.out.println(" 80 Found at index " + i);
                
            }
        }
        //3.Counting - count how many students passed
        int count = 0;
        for (int i = 0; i < marks.length; i++)
        {
            if (marks[i] >= 40)
            {
                count++;
            }
        }
        //4. Extremes - find highest and lowest marks
        int highest  = marks[0];
        int lowest = marks[0];
        for (int i = 1; i < marks.length; i++)
        {
            if (marks[i] > highest)
            {
                highest = marks[i];
            }
            if (marks[i] < lowest)
            {
                lowest = marks[i];
            }
        }
        System.out.println("Highest marks = " + highest);
        System.out.println("Lowest marks = " + lowest);
    }
    
    
}
