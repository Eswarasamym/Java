public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "Hello";
        String output = removeDuplicates(input);
        System.out.println("Output: " + output);
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // For ASCII characters

        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                result.append(c);
                seen[c] = true;
            }
        }

        return result.toString();
    }
}
