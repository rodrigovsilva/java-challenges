package com.rvfs.javachallenges.hackerrank.challenges.strings;

public class DigitTranslation {
    public static int findRange(int num) {
        String numStr = Integer.toString(num);

        // Initialize max and min values to the input number
        StringBuilder maxStr = new StringBuilder(numStr);
        StringBuilder minStr = new StringBuilder(numStr);

        // Find the maximum digit and minimum digit in the number
        char maxDigit = '0';
        char minDigit = '9';

        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);

            // Update max and min digits
            maxDigit = (char) Math.max(maxDigit, digit);
            minDigit = (char) Math.min(minDigit, digit);
        }


        int maxVal = Integer.parseInt(maxStr.toString());
        int minVal = Integer.parseInt(minStr.toString());

        return maxVal - minVal;
    }

    public static void main(String[] args) {
        // Example usage:
        int numExample = 10018;
        int result = findRange(numExample);
        System.out.println(result == 80088);
    }
}
