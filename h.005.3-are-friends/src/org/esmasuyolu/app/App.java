package org.esmasuyolu.app;

public class App {
    public static void main(String[] args)
    {
        // the method is tested until it finds a pair of four-digit friends number
        EXIT_LOOP:
        for (int i = 1000; i <= 9999; ++i)
            for (int k = 1000; k <= 9999; ++k)
                if (MathUtil.areFriends(i, k)) {
                    System.out.printf("%d and %d form a friendly pair%n", i, k);
                    break EXIT_LOOP;
                }
    }
}
