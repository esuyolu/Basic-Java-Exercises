package org.esmasuyolu.app;

public class MathUtil {
    public static void printPrimeFactors(int num)
    {
        int primeNumVar = 2;

        for (;;) {
            if (NumberUtil.isPrime(num) || num <= 1) {
                System.out.println(num);
                break;
            }

            if (num % primeNumVar == 0) {
                System.out.println(primeNumVar);
                num /= primeNumVar;
            }

            else {
                ++primeNumVar;
                while (!NumberUtil.isPrime(primeNumVar))
                    ++primeNumVar;
            }
        }
    }
}
