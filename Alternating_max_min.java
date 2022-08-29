import java.util.Arrays;

public class Alternating_max_min {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] res = maxmin(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int[] maxmin(int[] arr){
        Arrays.sort(arr);
        int n = arr.length-1;
        if(n== 0 | n == 1){
            return arr;
        }
        for (int i = 0; i < n; i = i+2) {
            int min = arr[i];
            int max = arr[n];

            arr[i] = max;
            for (int j = n; j >=i+2; j--) {
                arr[j] = arr[j-1];
            }
            arr[i+1] = min;
        }
        return arr;
    }
}
