package org.esmasuyolu.app;

public class App {
    public static void main(String[] args)
    {
        // there is a single 4 digit perfect number. write program to find 4-digit perfect number using the isPerfect method
        for (int i = 1000; i <= 9999; ++i)
            if (MathUtil.isPerfect(i))
                System.out.printf("there is a single 4 digit perfect number : %d", i);
    }
}
