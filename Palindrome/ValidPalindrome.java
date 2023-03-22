package Palindrome;

import java.util.Locale;

public class ValidPalindrome {

    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray())
        {
            if(Character.isLetter(c) || Character.isDigit(c) )
            {
                sb.append(c);
            }
        }

        String str = sb.toString().toLowerCase();

        for(int i = 0; i < str.length()/2; i++)
        {
            if(str.charAt(str.length()-1-i) !=  str.charAt(i))
                return false;
        }

        return true;
    }


    public static void main(String[] args){
        ValidPalindrome v = new ValidPalindrome();

        var result1 = v.isPalindrome("A man, a plan, a canal: Panama");
        var result2 = v.isPalindrome("race a car");
        var result3 = v.isPalindrome("");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
