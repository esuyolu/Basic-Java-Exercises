package org.esmasuyolu.app;

public class NumberUtil {

    public static double getE()
    {
        double e = 2;

        for (int i = 2; i < 10; ++i)
            e += 1. / factorial(i);

        return e;
    }

    public static long factorial(int num)
    {
        if (num < 0)
            return -1;

        long result = 1;

        for (int i = 2; i <= num; ++i)
            result *= i;

        return result;
    }
}
