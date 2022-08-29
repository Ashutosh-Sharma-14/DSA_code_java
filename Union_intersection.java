import java.util.Arrays;

public class Union_intersection {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {1,2,3,4,5};
        int[] result = doUnion(a,a.length,b,b.length);
        System.out.println(Arrays.toString(result));
    }

    static int[] doUnion(int a[], int n, int b[], int m){
        int[] union = new int[m+n];
        int x = n;
        int y = m;
        if(n > m){
            for (int i = 0; i < n; i++) {
                union[i] = a[i];
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(b[i] != union[j]){
                        union[x] = b[i];
                        x++;
                    }
                }
            }
        }

        if(m > n){
            for (int i = 0; i < m; i++) {
                union[i] = b[i];
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i] != union[j]) {
                        union[y] = a[i];
                        y++;
                    }
                }
            }
        }
        return union;
    }
}
