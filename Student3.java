public class Student3 {
    public static void main(String[] args) {
        java.lang.String[] names = {"John Doe", "Alice Smith", "Rahul Patel"};
        int[] rollNos = {1, 2, 3};
        double[] cgpas = {3.5, 3.8, 3.2};
        char[] genders = {'M', 'F', 'M'};
        boolean[] isEnrolled = {true, true, false};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Name     : " + names[i]);
            System.out.println("  Roll No  : " + rollNos[i]);
            System.out.println("  CGPA     : " + cgpas[i]);
            System.out.println("  Gender   : " + genders[i]);
            System.out.println("  Enrolled : " + isEnrolled[i]);
            System.out.println();
        }
    }
}
