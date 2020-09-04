package org.esmasuyolu.app;

public class DisplayTime {
    public static void displayDuration(long second)
    {
        long hour = 0, minute = 0;

        hour = second / 3600;
        minute = second % 3600 / 60;
        second = second % 3600 % 60;

        System.out.println("************");

        if (hour != 0)
            System.out.printf("hour:%d%n", hour);
        if (minute != 0)
            System.out.printf("minute:%d%n", minute);
        if (second != 0)
            System.out.printf("second:%d%n", second);
    }
}
