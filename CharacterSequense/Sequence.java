package CharacterSequense;
/*
Given two strings s and t, return true if
s is a subsequence of t, or false otherwise
 */

public class Sequence {
    //region Simple solution with While loop - Time complexity O(n)
    /**
     * Method with while loop to validate if a string is subsequence of another string
     * @param s
     * @param t
     * @return
     */
    public boolean isSequence(String s, String t){
        //assigning variables
        int i = 0, j = 0;
        int n = t.length();
        int m = s.length();

        //convert each string to char array
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();

        if(m < 1) return true; // check is string is empty

        //loop and compare two strings
        while(i < n){
            if(tt[i] == ss[j]){
                j++;
            }
            i++;
            if(j==m) return true;
        }
        return false;
    }
    //endregion

    //region Another solution with For Loop - Space complexity 0(1)

    /**
     * Method with for loop to validate if a string is subsequence of another string
     * @param s
     * @param t
     * @return
     */

    public boolean isSequenceWithForLoop(String s, String t){
        //assigning variables
       int count = 0;

       //check if string is empty
       if(s.length() == 0) return true;

       //loop through second string
       for(int i = 0;  i < t.length(); i++){
           if(s.charAt(count) == t.charAt(i)){ //compare each character of strings
               count++;

               if(count == s.length()) return true;
           }
       }
       return  false;
    }

    //endregion

}
