public class Consecutivechar {
    public static void main(String[] args) {
        String s = "aabaa";
        System.out.println(removeConsecutiveCharacter(s));
    }

    static String removeConsecutiveCharacter(String s){
        if (s.length() == 0 | s.length()==1){
            return s;
        }
        String a =s.substring(0,1);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)){
                continue;
            }
            else {
                a = a + s.charAt(i);
            }
        }
        return a;
    }
}
