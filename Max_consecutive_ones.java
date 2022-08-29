public class Max_consecutive_ones {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(max_consecutive(nums));
    }

    static int max_consecutive(int[] nums){
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
            }
            if (nums[i] == 0){
                if(count > max){
                    max = count;
                }
                count = 0;
            }
        }
        return Math.max(max,count);
    }
}
