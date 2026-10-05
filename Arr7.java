import java.util.Scanner;

class Arr7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int size = sc.nextInt();

		int[] a = new int[]{10, 20, 30, 40, 50};
		int[] b = new int[5];

		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			b[i] = a[i];
		}

		System.out.println("Elements of the copied array:");
		for (int element : b) 
        {
			System.out.print(element + " ");
		}

		sc.close();
	}
}
