package ass1;

public class Q1 {
    
    public static void main(String[] args) {
        SelfDrivingNumbers(9, 22);
    }

    public static void SelfDrivingNumbers (int n, int k) {
        while (n <= k) {
            int fDigit = n / 10;
            int lDigit = n % 10;

            if (lDigit % fDigit == 0 || fDigit % lDigit == 0) {
                System.out.println(n);
            }

            // System.out.println(n);
            n ++;
        }
    }
}
