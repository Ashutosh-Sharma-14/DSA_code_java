import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

    }

    static void merge(int[] arr1,int[] arr2,int n,int m){
        int temp;
        for (int i = 0; i < n; i++) {
            if (arr1[n-1-i] > arr2[i]){
                temp =arr1[n-1-i];
                arr1[m-1-i] = arr2[i];
                arr2[i] = temp;
            }

            if(arr1[n-1-i] < arr2[i]){
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }
}
