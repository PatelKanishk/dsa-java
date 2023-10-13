package ass1;

public class Q5 {
    
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static void factors(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static int factorial(int n) { // took hint
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        } 
    }
}
