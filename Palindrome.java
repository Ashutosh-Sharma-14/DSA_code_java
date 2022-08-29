import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Hello @!World";
        boolean res = palindrome(s);
        System.out.println(res);
    }

    static Boolean palindrome(String s){
        String str = s;
        str = str.toLowerCase();

//        replace() only replaces one character with another
//        replaceAll() changes all occurences of specified string with another string
        str = str.replaceAll("[^a-zA-Z0-9]","");
//        System.out.println(str);

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() -1 -i)){
                return false;
            }
        }
        return true;
    }
}
