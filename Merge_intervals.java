import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,2}};
        int[][] res = merge(intervals);
        for (int i = 0; i < res.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < res[i].length; j++)
                System.out.print(res[i][j] + " ");

    }

    static int[][] merge(int[][] intervals){
        if (intervals.length <=1){
            return intervals;
        }

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int[] pointer  = intervals[0];
        List<int[]> list = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            if (pointer[1] >= intervals[i][0]){
                if (intervals[i][1] < pointer[1]){
                    pointer[1] = pointer[1];
                }
                else {
                    pointer[1] = intervals[i][1];
                }
                if(i == intervals.length-1){
                    list.add(pointer);
                }
            }

            if (pointer[1] < intervals[i][0]){
                list.add(pointer);
                pointer = intervals[i];
                if(i == intervals.length-1){
                    list.add(pointer);
                }
            }

        }
        return list.toArray(new int[list.size()][]);
    }
}
