public class PangramChecker {
    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // Output: true
        System.out.println(isPangram("Hello, world!")); // Output: false
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase(); // Convert input to lowercase to handle both upper and lower case letters

        // Create an array to mark the presence of each letter (a-z)
        boolean[] letterPresent = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letterPresent[c - 'a'] = true;
            }
        }

        // Check if all letters (a-z) are present
        for (boolean letter : letterPresent) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
