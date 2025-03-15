 class StringReverser {

    public static void main(String[] args) {
        String input = "hi@how!are you";
        String output = reverseBetweenSpecialCharacters(input);
        System.out.println("Output: " + output);
    }

    public static String reverseBetweenSpecialCharacters(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        System.out.println("Left :"+left);
        int right = chars.length - 1;
        System.out.println("Right :"+right);

        while (left < right) {
            System.out.println(left < right);
            // Skip special characters on the left
            if (!Character.isLetterOrDigit(chars[left])) {
                System.out.println(!Character.isLetterOrDigit(chars[left]));
                left++;
            }
            // Skip special characters on the right
            else if (!Character.isLetterOrDigit(chars[right])) {
                right--;
            }
            // Swap characters
            else {
                char temp = chars[left];
                System.out.println("Temp"+temp);
                System.out.println("___________________________");
                System.out.println("Temp char"+chars[left]);
                System.out.println("___________________________");

                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
