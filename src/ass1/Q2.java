package ass1;

public class Q2 {
    
    public static void main(String[] args) {
        printPalindromes(10, 115);
    }

    public static int reverseInt(int n) {
        int rev = 0;
        int rem = 0;

        while (n!=0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        return rev;
    }

    public static void printPalindromes(int n, int k) {
        while (n <= k) {
            if (n == reverseInt(n)) {
                System.out.println(n);
            }
            n ++;
        }
    }
}
