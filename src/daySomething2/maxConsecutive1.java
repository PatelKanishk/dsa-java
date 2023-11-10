package daySomething2;

public class maxConsecutive1 {
    
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,1};
        Consecutive1(arr);
    }

    public static void Consecutive1(int[] arr) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                max = Math.max(max,count);
                count = 0;
            } else if (arr[i] == 1) {
                count++;
            }

            max = Math.max(max,count);
        }
        System.out.println(max);
    }

    public static void Consecutive1s(int[] arr) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;
                max = Math.max(max,count);
            } else if (arr[i] == 0) {
                count = 0;
            }
            
        }
        System.out.println(max);
    }
}