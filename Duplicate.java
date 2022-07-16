public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        int res = repeated(nums);
        System.out.println(res);
    }

    static int repeated(int[] nums){
        int k = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            k = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if( nums[j] == k){
                    count++;
                }
            }
            if(count >= 2){
                break;
            }
            else {
                count =0;
            }
        }
        return k;
    }
}
