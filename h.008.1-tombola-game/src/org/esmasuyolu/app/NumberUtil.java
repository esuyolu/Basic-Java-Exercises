package org.esmasuyolu.app;

public class NumberUtil {
    public int max(int a, int b, int c)
    {
        return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    }

    public int min(int a, int b, int c)
    {
        return (a < b) ? (a < c ? a : c) : (b < c ? b : c);
    }

    public int mid(int a, int b, int c)
    {
        if (a < b)
            if (c < b)
                if (a < c)
                    return c;
                else
                    return a;
            else
                return b;
        else if (b < a)
            if (b < c)
                if (a < c)
                    return a;
                else
                    return c;
            else
                return b;
        else
            return a;
    }

    public boolean isPrime(int val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        if (val % 11 == 0)
            return val == 11;

        for (int i = 13; i * i <= val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }
}
