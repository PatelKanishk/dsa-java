package ass1;

public class Q6 {
    
    public static void main(String[] args) {
        StrongNum(145);
        // System.out.println(digits(147));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        } 
    }

    public static int digits(int n) {
        int rem = 0;
        int fac = 0;
        int sum = 0;

        while (n != 0) {
            rem = n % 10;
            // System.out.println(rem);
            fac = factorial(rem); // why this was printing 1 as output.
            n /= 10;
            sum = sum + fac;
        }
        return sum;
    }

    public static void StrongNum(int n) {
        if (n == digits(n)) {
            System.out.println("True");
        } else System.out.println("False");
    }
}
