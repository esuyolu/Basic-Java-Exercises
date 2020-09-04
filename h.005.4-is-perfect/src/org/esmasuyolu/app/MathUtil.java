package org.esmasuyolu.app;

public class MathUtil {

    public static boolean isPerfect(int n)
    {
        if (n == sumFactors(n))
            return true;

        return false;
    }

    public static int sumFactors(int n)
    {
        int sumFac = 1;

        for (int i = 2; i <= n / 2; ++i)
            if (n % i == 0)
                sumFac += i;

        return sumFac;
    }

}
