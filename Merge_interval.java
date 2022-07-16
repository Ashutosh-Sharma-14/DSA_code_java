import java.util.Arrays;
import java.util.List;

public class Merge_interval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

    }

    static int[][] merge(int[][] intervals){
        List interval = Arrays.asList(intervals);
        for (int i = 0; i < intervals.length; i++) {
            if(interval.get(i)[1] >= intervals[i+1][0]){
                intervals[i][1] = intervals[i+1][1];
                intervals.remo
            }
        }
        return intervals;
    }
}
