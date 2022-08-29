public class Rotated_sortedarray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8};
        int res = search(nums,5);
        System.out.println(res);
    }

    static int search(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] >= nums[start]){
                if (nums[mid] > target && target >= nums[start]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }

            if (nums[mid] <= nums[end]){
                if (nums[mid] < target && target <= nums[end]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
