package NumberOf1Bits;

import java.math.BigInteger;

public class NumberOf1BitsTest {
    public static void main(String[]args){
        NumberOf1Bits num = new NumberOf1Bits();

        System.out.println("\n Solution with built in method bitCount");
        System.out.println(num.hammingWeightWithBitCount(00000000000000000000000000001011));
        System.out.println(num.hammingWeightWithBitCount(00000000000000000000000010000000));
        //System.out.println(num.hammingWeightWithBitCount(11111111111111111111111111111101)); //too large. Java complains
        /*
        Constraints: The input must be a binary string of length 32.
         */
        //System.out.println(num.hammingWeightWithBitCount(Integer.parseUnsignedInt("11111111111111111111111111111101")));//NumberFormatException
        //System.out.println(num.hammingWeightWithBitCount(Integer.parseUnsignedInt("00000000000000000000000000001011"))); //wrong answer n = 8.

        /*
        Note:

        Note that in some languages, such as Java, there is no unsigned integer type.
        In this case, the input will be given as a signed integer type.
        It should not affect your implementation, as the integer's internal binary representation is the same,
        whether it is signed or unsigned.
        In Java, the compiler represents the signed integers using 2's complement notation.
        Therefore, in Example 3, the input represents the signed integer. -3.
         */
        System.out.println(num.hammingWeightWithBitCount(-3));//from note to Java

        System.out.println("\n Solution with For loop");
        System.out.println(num.hammingWeightWithForLoop(00000000000000000000000000001011));
        System.out.println(num.hammingWeightWithForLoop(00000000000000000000000010000000));
        //System.out.println(num.hammingWeightWithForLoop(11111111111111111111111111111101)); // too large. Java complains
        System.out.println(num.hammingWeightWithForLoop(-3));//from note to Java

        System.out.println("\n Solution with While loop");
        System.out.println(num.hammingWeightWithWhileLoop(00000000000000000000000000001011));
        System.out.println(num.hammingWeightWithWhileLoop(00000000000000000000000010000000));
        //System.out.println(num.hammingWeightWithWhileLoop(11111111111111111111111111111101)); // too large. Java complains
        System.out.println(num.hammingWeightWithWhileLoop(-3));//from note to Java

        System.out.println("\n Solution with Recursion");
        System.out.println(num.hammingWeightWithRecursion(00000000000000000000000000001011));
        System.out.println(num.hammingWeightWithRecursion(00000000000000000000000010000000));
        //System.out.println(num.hammingWeightWithRecursion(11111111111111111111111111111101)); // too large. Java complains
        System.out.println(num.hammingWeightWithRecursion(-3));//from note to Java

    }
}
