public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("XII")); // Output: 12
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'I') {
                result += 1;
            } else if (c == 'V') {
                result += 5;
            } else if (c == 'X') {
                result += 10;
            } else if (c == 'L') {
                result += 50;
            } else if (c == 'C') {
                result += 100;
            } else if (c == 'D') {
                result += 500;
            } else if (c == 'M') {
                result += 1000;
            }
        }

        return result;
    }
}
