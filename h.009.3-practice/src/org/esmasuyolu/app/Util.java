package org.esmasuyolu.app;

public class Util {
    public static String practice(String s)
    {
        s = s.trim();

        if (s.isEmpty())
            return "";

        return "(".concat(s).concat(")");
    }
}
