//the concept is that if "and" operation of the number is done with 1
//the result will give 1, if the bit at that place in the number is 1

//so we do and operation in each iteration and shift the value of 1 in the mask
// that is used to do the and operation


// Q. Write a function that takes an unsigned integer and returns the number
// of '1' bits it has (also known as the hamming weight)
public class NumberofOnes {
    public static void main(String[] args) {
        int n = 6;
        int res = hammingweight(n);
        System.out.println(res);
    }

    static int hammingweight(int n){
        int count = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if((n & mask) !=0){
                count++;
            }
            mask = mask << 1;
        }
        return count;
    }

//    Approach 2: by continuously doing the and operation of n and n-1;
//    till n becomes 0, the number of times "&" operation can be performed
//    is equal to the number of 1's preset in the number
    public int hammingWeight(int n) {
        int count = 0;

        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
