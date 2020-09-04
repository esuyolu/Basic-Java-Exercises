package org.esmasuyolu.app;

public class Util {
    public static void practise(String str)
    {
        int len = str.length();

        for (int i = 0; i < len; ++i) {
            for (int k = 0; k <= i; ++k)
                System.out.print(str.charAt(k));

            System.out.println();
        }
    }
}
