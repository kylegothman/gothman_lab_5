public class PalindromeDetector {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); 
        str = str.replaceAll("[^a-zA-Z0-9]", ""); 
        return isPalindromeRecursive(str); 
    }

// Recursive helper method to check if a word is a palindrome
    private static boolean isPalindromeRecursive(String str) {
        // Base case: if the word has 0 or 1 characters, it is a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Recursive case: if the first and last characters are the same, check the rest of the word
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindromeRecursive(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }



    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        String[] words = {"Tennet", "Feel my bicep", "Able was I, ere I saw Elba", "Sick socks"};
        for (String word : words) {
            System.out.println("\"" + word + "\"" + " --> palindrome: " + isPalindrome(word));
        }
    }
}
