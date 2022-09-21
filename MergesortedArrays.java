public class MergesortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        int[] res = merge(nums1,m,nums2,n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }

    static int[] merge(int[] nums1,int m,int[] nums2,int n){
        for(int i = m;i< m+n ;i++){
            nums1[i] = nums2[i - m];
        }

        int j = m;
        for (int i = 0; i < m+n; i++) {
            if (i == j){
                break;
            }

            if (nums1[j] < nums1[i]){
                int temp = nums1[i];
                nums1[i] = nums1[j];
                nums1[j] = temp;
                j++;
            }
            else if (nums1[j] == nums1[i]){
                int temp = nums1[i+1];
                nums1[i+1] = nums1[j];
                nums1[j] = temp;
                j++;
            }
            else{
                continue;
            }
        }
        return nums1;
    }
}
