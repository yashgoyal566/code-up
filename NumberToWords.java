/* This class helps in converting a number into its English word representation.
   Class Owner: Yash Goyal
   Date: 17-09-2025
*/

import java.util.Scanner;

public class NumberToWords {


    public static int getLength(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int reverse(int n) {
        int newNum = 0;
        while (n > 0) {
            int dig = n % 10;
            newNum = newNum * 10 + dig;
            n = n / 10;
        }
        return newNum;
    }
    public static void numberToString(int n) {
        if (n == 0) {
            System.out.println("zero");
        } else if (n == 1000) {
            System.out.println("one-thousand");
        } else {
            String[] singleDigit = {"one","two","three","four","five","six","seven","eight","nine"};
            String[] doubleDigit = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
            String[] threeDigit = {"one-hundred","two-hundred","three-hundred","four-hundred","five-hundred","six-hundred","seven-hundred","eight-hundred","nine-hundred"};

            while (n > 0) {
                int len = getLength(n);
                int dig = n % 10;

                if (len == 1) {
                    System.out.print(singleDigit[dig - 1] + " ");
                } else if (len == 2) {
                    System.out.print(doubleDigit[dig - 1] + " ");
                } else {
                    System.out.print(threeDigit[dig - 1] + " ");
                }

                n = n / 10;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();

        int reversedNumber = reverse(n);
        numberToString(reversedNumber);
    }
}
