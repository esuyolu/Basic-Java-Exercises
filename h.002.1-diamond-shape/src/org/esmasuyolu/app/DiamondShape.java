package org.esmasuyolu.app;

public class DiamondShape {

    public static void printDiamondShape(int n)
    {
        for (int i = 1; i <= n; ++i) {
            for (int k = n - i; k > 0; --k)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; ++j)
                System.out.print("*");
            System.out.println();
        }

        int temp = n;
        temp -= 1;

        for (int i = 1; i < n; ++i) {
            for (int k = 1; k <= i; ++k)
                System.out.print(" ");
            for (int j = 2 * temp - 1; j >= 1; --j)
                System.out.print("*");

            --temp;
            System.out.println();
        }
    }
}
