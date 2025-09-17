/* This class helps in converting a number a number into its English word representation.
   Class Owner: Yash Goyal
   Date: 17-09-2025
*/

import java.util.Scanner;

public class NumberToWords {

    private static final String[] belowTwenty = {
        "", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen",
        "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] thousands = {
        "", "thousand", "million", "billion"
    };

    public static String numberToWords(int num) {
        if (num == 0) {
            return "zero";
        }

        int i = 0;
        String words = "";

        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + thousands[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        return words.trim();
    }

    private static String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return belowTwenty[num] + " ";
        } else if (num < 100) {
            return tens[num / 10] + " " + helper(num % 10);
        } else {
            return belowTwenty[num / 100] + " hundred " + helper(num % 100);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        String result = numberToWords(number);
        System.out.println("In words: " + result);

        sc.close();
    }
}

