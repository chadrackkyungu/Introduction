/*
 * 2.1 Write a java program to check if a given string is a palindrome or not. A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward. Implement this using loop structures and string manipulation (10 Marks)
 * 
 */

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0; // Start pointer
        int right = str.length() - 1; // End pointer

        while (left < right) {
            // Check if characters at left and right are different
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++; // Move left pointer to the right
            right--; // Move right pointer to the left
        }

        return true; // If no mismatches are found, return it's a palindrome
    }
}
