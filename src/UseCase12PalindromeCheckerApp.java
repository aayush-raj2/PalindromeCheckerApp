import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

// 1️⃣ Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// 2️⃣ Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// 3️⃣ Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : normalized.toCharArray()) {
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

// 4️⃣ Context Class
class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

// 5️⃣ Application Class
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("=====================================");
        System.out.println("UC12: Strategy Pattern for Palindrome Algorithms");
        System.out.println("-------------------------------------");

        String input = "Was it a car or a cat I saw";

        // 🔁 Choose strategy dynamically
        PalindromeStrategy strategy = new DequeStrategy();
        // Try: new StackStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.execute(input);

        if (result) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}
