package org.esmasuyolu.app;

public class Sorting {
    public static void sortThreeNumbers(int a, int b, int c)
    {
        if (a < b)
            if (b < c)
                System.out.printf("%d < %d < %d", a, b, c);
            else if (b == c)
                System.out.printf("%d < %d = %d", a, b, c);
            else if (a < c)
                System.out.printf("%d < %d < %d", a, c, b);
            else if (a == c)
                System.out.printf("%d = %d < %d", a, c, b);
            else
                System.out.printf("%d < %d < %d", c, a, b);
        else if (b < a)
            if (c < b)
                System.out.printf("%d < %d < %d", c, b, a);
            else if (c == b)
                System.out.printf("%d = %d < %d", c, b, a);
            else if (a < c)
                System.out.printf("%d < %d < %d", b, a, c);
            else if (a == c)
                System.out.printf("%d < %d = %d", b, a, c);
            else
                System.out.printf("%d < %d < %d", b, c, a);
        else if (a < c)
            System.out.printf("%d = %d < %d", a, b, c);
        else if (a == c)
            System.out.printf("%d = %d = %d", a, b, c);
        else
            System.out.printf("%d < %d = %d", c, a, b);
    }
}
