package org.esmasuyolu.app;

public class App {
    public static void main(String[] args)
    {
        int [] a = {60, 82, 21, 96, 65, 65, 66, 55, 84, 59};

        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.println("\n------------------------------");

        System.out.printf("second largest element in the array(first way)  : %d%n", NumberUtil.secondMax1(a));

        System.out.printf("second largest element in the array(second way) : %d%n", NumberUtil.secondMax2(a));
    }
}
