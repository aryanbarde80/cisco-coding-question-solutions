import java.util.Stack;

public class RemoveBrackets {
    public static String removeBrackets(String expr) {
        Stack<Character> signStack = new Stack<>();
        signStack.push('+'); // overall sign
        StringBuilder result = new StringBuilder();
        char currentSign = '+';

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '+' || ch == '-') {
                currentSign = ch;
            } else if (ch == '(') {
                if (currentSign == '-') {
                    signStack.push(signStack.peek() == '+' ? '-' : '+');
                } else {
                    signStack.push(signStack.peek());
                }
            } else if (ch == ')') {
                signStack.pop();
            } else if (Character.isLetter(ch)) {
                char effectiveSign;
                if (currentSign == '-') {
                    effectiveSign = (signStack.peek() == '+' ? '-' : '+');
                } else {
                    effectiveSign = signStack.peek();
                }

                result.append(effectiveSign).append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String expression = "a-(b+c-d)+e";
        String simplified = removeBrackets(expression);
        System.out.println("Simplified Expression: " + simplified);
    }
}
