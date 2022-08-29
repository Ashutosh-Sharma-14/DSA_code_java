import java.util.HashMap;
import java.util.Map;

public class Single_number {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,3,3,5};
        int res = frequency_one(nums);
        System.out.println(res);
    }

    static int frequency_one(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) == true){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
               return entry.getKey();
            }
        }

        return -1;
    }
}
