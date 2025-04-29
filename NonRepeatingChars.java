import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChars {
    public static void printNonRepeating(String str) {
        Map<Character, Integer> freq = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Print characters with frequency 1
        System.out.print("Non-repeating characters: ");
        for (char ch : str.toCharArray()) {
            if (freq.get(ch) == 1) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {
        String input = "programming";
        printNonRepeating(input);
    }
}
