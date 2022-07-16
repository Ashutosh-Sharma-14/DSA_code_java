public class Maximum_subarray {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int res = kadane(arr,arr.length);
        System.out.println(res);
    }

    static int kadane(int[] arr, int n){
        int max = arr[0];
        int max_end_here = 0;
        int max_neg = arr[0];
        int count = 0;

//  when all the values are negative
        for (int i = 1; i < n; i++) {
            if(arr[i] > max_neg){
                max_neg = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                count++;
            }
        }

        if(count == 0) {
            max = max_neg;
        }
//        when all values are not negative
        for (int i = 0; i < n; i++) {
            max_end_here = max_end_here +arr[i];

            if(max_end_here < 0){
                max_end_here = 0;
            }

            else if(max < max_end_here){
                max = max_end_here;
            }
        }
        return max;
    }

}
