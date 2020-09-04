package org.esmasuyolu.app;

public class Sorting {
    public static int mid(int a, int b, int c)
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
}
