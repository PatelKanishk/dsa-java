package daySomething2;

public class sqSortedArr {
    
    public static void main(String[] args) {
        int [] arr = {-10, -1, 0, 3, 4};
        int[] result = SqSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }

    public static int[] SqSort(int[] arr) {
        int[] result = new int[arr.length];

        int i = 0;
        int j = arr.length - 1;
        int k = arr.length - 1;

        while(i <= j) {
            int val1 = arr[i] * arr[i];
            int val2 = arr[j] * arr[j];

            if (val1 < val2) {
                result[k] = val2;
                j--;
            } else {
                result[k] = val1;
                i++;
            }
            k--;

        }

        return result;
    }
}
