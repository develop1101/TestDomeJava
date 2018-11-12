/**
A palindrome is a word that reads the same backward or forward.
Write a function that checks if a given word is a palindrome. Character case should be ignored.
For example, isPalindrome("Deleveled") should return true as character case should be ignored, 
resulting in "deleveled", which is a palindrome since it reads the same backward and forward.
**/

public class Palindrome {
    public static boolean isPalindrome(String word) {
        
        for (int i=0; i<word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(word.length()-i-1))) {
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
