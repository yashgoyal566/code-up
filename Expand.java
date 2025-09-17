/* This class helps to expand each character by repeating it according to the digit that follows.
   Class Owner: Yash Goyal
   Date: 17-09-2025
*/

import java.util.Scanner;

public class Expand {
    

    public static String expand(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Ensure next character exists and is a digit
            if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                int count = Character.getNumericValue(input.charAt(i + 1));

                for (int j = 0; j < count; j++) {
                    result.append(ch);
                }

                i++; // Skip the digit since it's already processed
            } else {
                // If there's no digit, just append the character once
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (e.g., a2b3c1): ");
        String input = sc.nextLine();

        String output = expand(input);
        System.out.println("Expanded string: " + output);

        sc.close();
    }
}
