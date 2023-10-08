package day4;

public class rotateNum {
    
    public static void main(String[] args) {
        int n = 12345;
        int k = 2;
        Rotate(n, k);
    }

    public static int Count(int n) {
        int count = 0;

        while (n!=0) {
            count ++;
            n = n/10;
        }

        return count;
    }

    public static void Rotate(int n, int k) {
        double i = n / Math.pow(10, k);
        double j = n % Math.pow(10, k);
        double numOfRotation = Math.pow(10, (Count(n)-k));

        int rotation = (int)numOfRotation;
        int x = (int)i;
        int y = (int)j;

        // System.out.println(x);
        // System.out.println(y);

        n = y * rotation + x;
        System.out.println(n);
    }
}
