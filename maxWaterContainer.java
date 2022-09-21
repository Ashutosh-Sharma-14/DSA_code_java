public class maxWaterContainer{
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(height);
        System.out.println(res);
    }

    static int maxArea(int[] height){
        int maxArea = 0;
        int right = height.length-1,left = 0;
        int currArea = 0;
        while(left < right){
            if(height[left] <= height[right]){
                currArea = height[left] * (right-left);
                left++;
                maxArea = maxArea < currArea ? currArea :maxArea;
            }
            if(height[left] > height[right]){
                currArea = height[right] * (right-left);
                right--;
                maxArea = maxArea < currArea ? currArea :maxArea;
            }
        }
        return maxArea;
    }
}