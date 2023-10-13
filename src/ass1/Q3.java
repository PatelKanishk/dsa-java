package ass1;

public class Q3 {

    public static void main(String[] args) {
        printPrime(144);
    }
    
    public static void printPrime(int n) {
        for (int i = 2; i*i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
    }
}