import java.util.Arrays;

public class Negative_to_left {
    public static void main(String[] args) {
        int[] arr = {-10,5,-12,6,2,-3};
        int[] k = sort(arr);
        System.out.println(Arrays.toString(k));
    }

    static int[] sort(int[] arr){

        int temp;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }

    static int[] sort1(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        return arr;
    }
}
