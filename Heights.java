public class Heights {
    public static void main(String[] args) {
        int[] arr = {11,3,7,12,18,14,16,21,2,26,30,8,42};
        int res = sunrise(arr);
        System.out.println("buildings that can see sunrise = "+ res);
    }
    static int sunrise(int[] arr){
        int count=0;

        if (arr[0] > arr[1]){
            count = 1;
        }
        else {
            count = 2;
        }

        int max = arr[0] > arr[1]? arr[0]:arr[1];

        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i+1] > max){
                max = arr[i+1];
                count = count + 1;
            }
        }
        return count;
    }
}
