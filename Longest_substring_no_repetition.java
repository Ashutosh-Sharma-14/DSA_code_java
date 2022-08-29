import java.util.HashSet;
import java.util.Set;

public class Longest_substring_no_repetition {
    public static void main(String[] args) {
        String s = "abcabcbba";
        int res = length(s);
        System.out.println(res);
    }

    static int length(String s){
        if (s.length() == 0 | s == null){
            return 0;
        }
        int i=0,j=0,max = 0;
        Set<Character> set = new HashSet<>();

        while (i < s.length()){
            if (set.contains(s.charAt(i))!=true){
                set.add(s.charAt(i));
                i++;
            }
            else {
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
            }
            max = Math.max(max,i-j+1);
        }
        return max-1;
    }
}
