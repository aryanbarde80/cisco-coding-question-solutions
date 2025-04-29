import java.util.HashMap;

public class AnagramCheck {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : s1.toCharArray())
            count.put(c, count.getOrDefault(c, 0) + 1);

        for (char c : s2.toCharArray())
            count.put(c, count.getOrDefault(c, 0) - 1);

        for (int freq : count.values()) {
            if (freq != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen", str2 = "silent";

        if (areAnagrams(str1, str2))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
    }
}
