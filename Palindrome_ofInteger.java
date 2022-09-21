public class Palindrome_ofInteger {
    public static void main(String[] args) {
        boolean res = isPalindrome(2147483647);
        System.out.println(res);
    }

    static boolean isPalindrome(int x){
//        log to the base 10 can be used to find the number of digits
        int length = (int)(Math.log10(x) + 1);
        double num = 0;
        double val = x;
        int digit;
        for (int i = 0; i < length; i++) {
            digit = x%10;
            x = x/10;
            num = (double) (num + digit*Math.pow(10,length-i-1));
        }
        if (num!=val){
            return false;
        }
        return true;
    }
}
