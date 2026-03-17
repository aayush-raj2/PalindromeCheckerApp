public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("=====================================");
        System.out.println("UC9: Recursive Palindrome Checker");
        System.out.println("-------------------------------------");

        String input = "racecar";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }

    // Recursive method
    public static boolean isPalindrome(String str, int left, int right) {

        // Base condition
        if (left >= right) {
            return true;
        }

        // Mismatch condition
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }
}
