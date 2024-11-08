package dataStructuresAndAlgorithms.recursion;
//https://leetcode.com/problems/valid-palindrome/description/
public class LeetCode125 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return checkPal(s,0);
    }

    public static boolean checkPal(String s, int i){
        if(i>=s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return checkPal(s,i+1);
    }
}
