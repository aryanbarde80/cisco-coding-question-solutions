public class StringLength {
    public static void main(String[] args) {
        String str = "Hello, world!";
        char[] chars = str.toCharArray();
        int length = 0;

        for (char c : chars) {
            length++;
        }

        System.out.println("Length of the string is: " + length);
    }
}
