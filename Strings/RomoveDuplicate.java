class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "Hello";
        String res = removeDuplicate(s);
        System.out.println("Original String: " + s);
        System.out.println("String after removing duplicates: " + res);
    }

    public static String removeDuplicate(String s) {
        boolean[] a = new boolean[256];  // Boolean array to track character occurrence
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (!a[s.charAt(i)]) {  // If character is not already added
                ans += s.charAt(i);
                a[s.charAt(i)] = true;
            }
        }
        return ans;
    }
}
