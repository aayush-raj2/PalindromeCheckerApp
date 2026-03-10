public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("=====================================");
        System.out.println("UC2: Print a Hardcoded Palindrome Result");
        System.out.println("-------------------------------------");

        String word = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
