import java.util.Arrays;

public class Longestprefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String res = longestprefix(strs);
        System.out.println(res);
    }

    static String longestprefix(String[] strs){
//        sorting array of strings sort the elements in alphabetical order
        Arrays.sort(strs);
        if (strs.length == 0 | strs.length == 1){
            return "";
        }
        String first = strs[0];
        String last = strs[strs.length - 1];
        int count = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)){
                count++;
            }
//            agar first element match nhi ho raha to baki string compare nhi karna padega
            else{
                break;
            }
        }
        return first.substring(0,count);
    }
}
