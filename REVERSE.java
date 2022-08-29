import java.util.Arrays;

public class REVERSE {
    public static void main(String[] args) {
        int arr[] = {6,5,4,11,3,2,1};

        int temp;
        int end = arr.length-1;
        System.out.println(end);
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end = end-1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
