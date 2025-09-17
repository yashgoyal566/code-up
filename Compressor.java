/* This class helps to compress a string by showing each character followed by its frequency.
   Class Owner: Yash Goyal
   Date: 17-09-2025
*/
import java.util.Scanner;

public class Compressor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();
        sc.close();

        String compressed = compress(input);
        System.out.println("Compressed form: " + compressed);
    }

    // Method to compress string using character frequencies
    public static String compress(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append last character and its count
        result.append(s.charAt(s.length() - 1)).append(count);

        return result.toString();
    }
}
