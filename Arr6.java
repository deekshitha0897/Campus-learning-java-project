import java.util.Scanner;

class Arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int no = sc.nextInt();
        int[] a = new int[no];
        int sum = 0;

        System.out.println("Enter the array elements:");
        for (int i = 0; i < no; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        System.out.println("Sum of all array elements = " + sum);
        sc.close();
    }
    
}    

