package NumberOf1Bits;

public class NumberOf1Bits {
    // you need to treat n as an unsigned value

    //region Solution with built in method bitCount
    public int hammingWeightWithBitCount(int n) {
        // int key = 1;
        return Integer.bitCount(n);
    }
    //endregion

    //region Another For loop solution. Time Complexity O(1). It will always loop 32 times
    public int hammingWeightWithForLoop(int n){
        //range of bits from = 0, to = 32
        int count = 0, mask = 1;
        for(int i = 0; i < 32; i++){
            if((n & mask) != 0) count++;
                mask = mask << 1; // shift to left by 1
        }
        return  count;
    }
    //endregion

    //region Improve the above solution. Time complexity also O(1)
    public int hammingWeightWithWhileLoop(int n){
        int count = 0;
        while (n != 0){
            n = n& (n - 1);
            count ++;
        }
        return count;
    }
    //endregion

    //region Convert Solution to Recursive call. Time complexity remains the same O(1)
    public int hammingWeightWithRecursion(int n) {
        //exit condition
        if(n==0) return 0;
        if(n==1) return 1;

        //recursively call function and each time add 1
        return hammingWeightWithRecursion(n&(n-1)) + 1;
    }
    //endregion
}
