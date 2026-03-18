class PalindromeChecker {

    // Encapsulated method
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize string (ignore spaces and case)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("=====================================");
        System.out.println("UC11: Object-Oriented Palindrome Service");
        System.out.println("-------------------------------------");

        String input = "Never Odd Or Even";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}
