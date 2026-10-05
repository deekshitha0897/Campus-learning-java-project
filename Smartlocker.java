 class Smartlocker 
 {
    static int findfreeSlot(int[] occupied)
    {
        for (int i = 0; i < occupied.length; i++)
        {
            if (occupied[i] == 0)
            {
                return i;
            }
        }
        return -1; // No free slot found
    }
    public static void main(String args[])
    {
        int[] occupied = {1, 1, 0, 1, 0}; // 1 means occupied, 0 means free
        int freeSlotIndex = findfreeSlot(occupied);
        
            System.out.println("First free slot is at index: " + freeSlotIndex);
        
    }
    
}
