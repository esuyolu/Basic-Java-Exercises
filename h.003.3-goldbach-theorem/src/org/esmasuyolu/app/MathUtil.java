package org.esmasuyolu.app;

public class MathUtil {
    public static void goldbach(int val)
    {
        int primeNumVal = 2;

        for (;;) {
            if (primeNumVal == val - 2)
                break;

            if (NumberUtil.isPrime(primeNumVal) && NumberUtil.isPrime(val - primeNumVal))
                System.out.printf("%d -> %d + %d%n", val, primeNumVal, val - primeNumVal);

            ++primeNumVal;
        }
    }
}
