public class Unique_cahr {
    public static void main(String[] args) {
        String s = "leetcodeltc";
        int res = firstunique_char(s);
        System.out.println(res);
    }

    public static int firstunique_char(String s){

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)){
                    count++;
                }
            }
            if (count == s.length()){
                return i;
            }
        }
        return -1;
    }

    public static int firstuniquechar(String s){
//        this function does the work in O(n) time complexity
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i- 'a')] == 1){
                return i;
            }
        }
        return -1;
    }

}
