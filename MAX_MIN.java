import java.util.Arrays;

public class MAX_MIN {
    public static void main(String[] args) {
        int arr[] = {1,2};
        int result[] = max_min(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] max_min(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        int m[] = {max,min};
        return m;
    }
}
