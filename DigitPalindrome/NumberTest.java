package DigitPalindrome;

public class NumberTest {
    public static  void main(String[]args){
        NumberPalindrome number = new NumberPalindrome();
        System.out.println("\n Classic solution");
        number.palindrome(12521);
        number.palindrome(121);
        number.palindrome(-121);
        number.palindrome(10);

        System.out.println("\n Boolean with while loop");
        System.out.println(number.isPalindrome(12521));
        System.out.println(number.isPalindrome(121));
        System.out.println(number.isPalindrome(-121));
        System.out.println(number.isPalindrome(10));

        System.out.println("\n Boolean with for loop");
        System.out.println(number.isPalindromeWithForLoop(12521));
        System.out.println(number.isPalindromeWithForLoop(121));
        System.out.println(number.isPalindromeWithForLoop(-121));
        System.out.println(number.isPalindromeWithForLoop(10));
    }
}
