import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("=====================================");
        System.out.println("UC13: Performance Comparison");
        System.out.println("-------------------------------------");

        String input = "A man a plan a canal Panama";

        // Normalize once
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // ===============================
        // 1️⃣ Two Pointer Approach
        // ===============================
        long start1 = System.nanoTime();

        boolean result1 = twoPointerCheck(normalized);

        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // ===============================
        // 2️⃣ Stack Approach
        // ===============================
        long start2 = System.nanoTime();

        boolean result2 = stackCheck(normalized);

        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // ===============================
        // 3️⃣ Deque Approach
        // ===============================
        long start3 = System.nanoTime();

        boolean result3 = dequeCheck(normalized);

        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // ===============================
        // Results
        // ===============================
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result:       " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Result:       " + result3 + " | Time: " + time3 + " ns");
    }

    // Two Pointer Method
    public static boolean twoPointerCheck(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Stack Method
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque Method
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}
