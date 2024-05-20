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
