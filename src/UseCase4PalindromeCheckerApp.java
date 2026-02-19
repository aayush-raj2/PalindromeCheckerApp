public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("=====================================");
        System.out.println("UC4: Character Array Based Palindrome Check");
        System.out.println("-------------------------------------");

        String input = "level";

        char[] characters = input.toCharArray();

        int left = 0;
        int right = characters.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {

            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
