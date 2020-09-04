package org.esmasuyolu.app;

public class NumberUtil {
    public static int [] getDigits(int val)
    {
        val = Math.abs(val);
        int count = val == 0 ? 1 : (int)(Math.log10(Math.abs(val)) + 1);
        int [] digits = new int[count];

        for (int i = count - 1; i >= 0; --i) {
            digits[i] = val % 10;
            val /= 10;
        }

        return digits;
    }

    // A number is lucky if all digits of the number are different
    public static boolean isLucky(int n)
    {
        boolean arr[] = new boolean[10];

        while (n > 0)
        {
            int digit = n % 10;

            if (arr[digit])
                return false;

            arr[digit] = true;

            n = n / 10;
        }

        return true;
    }
}
