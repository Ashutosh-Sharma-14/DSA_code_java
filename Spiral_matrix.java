import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix {
    public static void main(String[] args) {
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiral(matrix);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    static List<Integer> spiral(int[][] matrix){
        List<Integer> res = new ArrayList<>();

        int colbegin = 0;
        int rowbegin = 0;
        int rowend = matrix.length-1;
        int colend = matrix[0].length-1;

        while(rowbegin<=rowend & colbegin<=colend){
            if(res.size() < matrix.length * matrix[0].length){
                for (int i = rowbegin; i <= colend; i++) {
                    res.add(matrix[rowbegin][i]);
                }
            }
            ++rowbegin;

            if(res.size() < matrix.length * matrix[0].length){
                for (int i = rowbegin; i <= rowend; i++) {
                    res.add(matrix[i][colend]);
                }
            }
            colend--;

            if(res.size() < matrix.length * matrix[0].length){
                for (int i = colend; i >=colbegin ; i--) {
                    res.add(matrix[rowend][i]);
                }
            }
            rowend--;

            if(res.size() < matrix.length * matrix[0].length){
                for (int i = rowend; i >= rowbegin; i--) {
                    res.add(matrix[i][colbegin]);
                }
            }
            colbegin++;
        }

        return res;
    }
}
