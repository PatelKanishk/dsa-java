package ass1;

public class Q4 {
    
    public static void main(String[] args) {
        perfectNum(28);
    }
    
    public static int factorsSum(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                // System.out.println(i);
            }
        }
        return(sum);
    }

    public static void perfectNum(int n) {
        if (n == factorsSum(n)) {
            System.out.println("The number: " + n + " is a perfect number.");
        } else System.out.println("False");
    }
}
