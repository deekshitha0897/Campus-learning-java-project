import java.util.Scanner;

class ParcelIntake {
    public static void main(java.lang.String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            java.lang.String id = sc.next();
            java.lang.String recipient = sc.next();
            char size = sc.next().charAt(0);
            double weight = sc.nextDouble();

            // storage fee = size base + weight surcharge (arithmetic + casting)
            int base = (size == 'L') ? 30 : (size == 'M') ? 20 : 10;
            int surcharge = (int) Math.ceil(weight) * 2; // Rs 2 per rounded-up kg
            int fee = base + surcharge;

            System.out.printf("Parcel: %s (%s)%n", id, recipient);
            System.out.printf("size: %c Weight: %.1fkg%n", size, weight);
            System.out.printf("Fee: Rs %d%n", fee);
        }
    }
}
