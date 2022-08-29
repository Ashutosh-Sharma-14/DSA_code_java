import java.util.HashMap;

public record Containsduplicate() {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 | nums.length == 1){
            return false;
        }
        int n = nums.length;

        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
//        .containskey() method is used to check presence of element in hashtable
//        .get() returns the value of key

        for (int i = 0; i < n; i++) {
            if(hash.containsKey(nums[i])){
                hash.put(nums[i],hash.get(nums[i])+1);
            }
            else {
                hash.put(nums[i],1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (hash.get(nums[i]) > 1){
                return true;
            }
        }
        return false;
    }

}
