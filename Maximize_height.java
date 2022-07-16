import java.util.Arrays;

public class Maximize_height {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int res = minimize(arr,3,arr.length);
        System.out.println(res);
    }

    static int minimize(int[] arr,int k,int n){
        if (n == 1){
            return 0;
        }
        Arrays.sort(arr);
        int min_diff = arr[n-1] - arr[0];
        int temp_min = arr[0];
        int temp_max = arr[n-1];

        for (int i = 1; i < n; i++) {
            if(arr[i] - k <0){
                continue;
            }

            temp_min = Math.min(arr[i] - k,arr[0]+k);
            temp_max = Math.max(arr[i-1] + k,arr[n-1]-k);
            min_diff = Math.min(temp_max - temp_min,min_diff);
        }
        return min_diff;
    }
}
