package org.esmasuyolu.app;

import java.util.Random;

public class Date {
    private static final String [] DAYS = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static final String [] MONTHS = {"", "Jan", "Feb", "Mar", "Apr", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private int m_day, m_mon, m_year;
    private int m_dayOfWeekValue;

    private static boolean isValidDate(int day, int mon, int year)
    {
        if (day < 1 || day > 31 || mon < 1 || mon > 12)
            return false;

        int days = Month.values()[mon - 1].getDays(year);

        return day <= days;
    }

    private static void control(int day, int mon, int year, String msg)
    {
        if (!isValidDate(day, mon, year))
            doWorkForException(msg);
    }

    private static void doWorkForException(String msg)
    {
        throw new DateException(msg);
    }

    private static int getDayOfYear(int day, int mon, int year)
    {
        int dayOfYear = day;

        for (int m = mon - 1; m >= 1; --m)
            dayOfYear += Month.values()[m - 1].getDays(year);

        if (mon > 2 && Month.isLeapYear(year))
            ++dayOfYear;

        return dayOfYear;
    }

    private static int getDayOfWeek(int day, int mon, int year)
    {
        int totalDays = getDayOfYear(day, mon, year);

        for (int y = 1900; y < year; ++y)
            totalDays += Month.isLeapYear(y) ? 366 : 365;

        return totalDays % 7;
    }

    private void set(int day, int mon, int year)
    {
        m_day = day;
        m_mon = mon;
        m_year = year;
        m_dayOfWeekValue = getDayOfWeek(m_day, m_mon, m_year);
    }

    public void setDate(int day, int mon, int year)
    {
        control(day, mon, year, "invalid date values");
        set(day, mon, year);
    }

    public Date(int day, int mon, int year)
    {
        setDate(day, mon, year);
    }

    private static String getDayPostfix(int day)
    {
        String postfix = "th";

        switch (day) {
            case 1:
            case 21:
            case 31:
                postfix = "st";
                break;
            case 2:
            case 22:
                postfix = "nd";
                break;
            case 3:
            case 23:
                postfix = "rd";
                break;
        }

        return postfix;
    }

    public static Date randomDate()
    {
        Random r = new Random();

        int year = r.nextInt(2100 - 1900 + 1) + 1900; //minYear = 1900, maxYear = 2100
        int mon = r.nextInt(12) + 1;
        int day = r.nextInt(Month.values()[mon - 1].getDays(year)) + 1;

        return new Date(day, mon, year);
    }

    public String printRandomDate()
    {
        return String.format("%02d%s %s %04d %s", m_day, getDayPostfix(m_day), MONTHS[m_mon], m_year, DAYS[m_dayOfWeekValue]);
    }
}
