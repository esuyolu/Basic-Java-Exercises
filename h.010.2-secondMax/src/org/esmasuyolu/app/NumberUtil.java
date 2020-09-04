package org.esmasuyolu.app;

public class NumberUtil {
    // First way
    public static int secondMax1(int [] a)
    {
        int max = a[0];
        int secondMax = a[0];

        for (int i = 1; i < a.length; ++i)
            if (a[i] > max)
                max = a[i];

        for (int i = 1; i < a.length; ++i)
            if (a[i] < max && a[i] > secondMax)
                secondMax = a[i];

        return secondMax;
    }

    // Second way
    public static int secondMax2(int [] a)
    {
        int size = a.length;
        int max = a[0];

        for (int i = 0; i < size; ++i)
            if (a[i] > max)
                max = a[i];

        int secondMax = a[0];
        int minDiff = max - secondMax;

        for (int i = 1; i < size; ++i) {
            int tempDiff = max - a[i];
            if (tempDiff != 0)
                if (tempDiff < minDiff) {
                    minDiff = tempDiff;
                    secondMax = a[i];
                }
        }

        return secondMax;
    }
}
