import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "ada";
        String t = "daa";
        boolean res = isAnagram(s,t);
        System.out.println(res);
    }

    static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        char arr1[]= s.toCharArray();
        char arr2[]= t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < s.length(); i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }

    static boolean isanagram(String s,String t){
        int alphabet[] = new int[26];

        if (s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i]!=0){
                return false;
            }
        }
        return true;
    }
}
