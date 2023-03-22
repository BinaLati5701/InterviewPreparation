package DigitPalindrome;

public class NumberPalindrome {
    //region Classic

    /**
     * Classic method for digits palindrome
     * @param num
     * @return
     */
    public int palindrome(int num){
        int resultNumber = 0;
        for(int i = num; i !=0; i /= 10){
            resultNumber = resultNumber * 10 + i % 10;
        }
        if(num <= 0){
            System.out.println(resultNumber +  " -> palindrome");;
        }
        else{
            System.out.println(resultNumber + " -> not a palindrome");
        }
        return resultNumber;
    }
    //endregion

    //region With While Loop

    /**
     * Solution using while loop
     * @param x
     * @return
     */
    public boolean isPalindrome(int x){
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() - 1;

        while(i <= j)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
    //endregion

    //region With For Loop

    /**
     *
     * @param x
     * @return
     */
    public boolean isPalindromeWithForLoop(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
    //endregion
}
