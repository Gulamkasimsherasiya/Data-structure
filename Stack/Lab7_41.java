import java.util.Scanner; 
import java.util.Stack;

public class Lab7_41 {      

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter No of Test Cases: ");
        int T = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        for (int i = 0; i < T; i++) {
            String input = scanner.nextLine();
            if (isBalanced(input)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
    }

    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
