package daySomething3;

public class move0s {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] result = moveZeros(arr);
        System.out.println(result);
    }

    public static int[] moveZeros(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i ++) {
            if (arr[j] != 0) {
                Swap(arr, i, j);
                j ++;
            }
        }

        return arr;
    }
    
    public static void Swap( int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
