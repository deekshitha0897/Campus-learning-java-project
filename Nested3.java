 class Nested3 
 {
    public static void main(String args[])
    {
        int i =5;
        while(i>=1)
        {
            int j =5;
            while(j>=i)
            {
                System.out.print(j+" ");
                j--;
            }    
            i--; 
            System.out.println();
        }    
    }
    
}
