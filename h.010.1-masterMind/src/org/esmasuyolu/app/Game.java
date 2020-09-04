package org.esmasuyolu.app;

import java.util.Random;
import java.util.Scanner;

import static org.esmasuyolu.app.NumberUtil.getDigits;
import static org.esmasuyolu.app.NumberUtil.isLucky;

public class Game {
    public static void masterMind()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        int counter;
        int num = r.nextInt(10000 - 1000) + 1000;

        while (!isLucky(num))
            num = r.nextInt(10000 - 1000) + 1000;

        int [] b = getDigits(num);

        boolean [] a = new boolean[10];

        for (int i = 0; i < b.length; ++i)
            a[b[i]] = true;

        for (counter = 1; counter <= 10; ++counter) {

            System.out.print("\nenter a different number of digits[1000-9999]:");
            int val = Integer.parseInt(kb.nextLine());

            int [] c = getDigits(val);

            for (int k = 0; k < c.length; ++k) {
                if (a[c[k]])
                    if (c[k] == b[k])
                        System.out.print("+");
                    else
                        System.out.print("-");
            }

            if (val == num)
                break;
        }

        if (counter == 11)
            System.out.println("\nlose :(");
        else
            System.out.println("\nwon :)");
    }
}