package org.esmasuyolu.app;

public class StringUtil {
    public static String changeCase(String str)
    {
        if (str.isEmpty())
            return "";

        char [] c = str.toCharArray();
        String s = "";

        for (char value : c)
            if (Character.isUpperCase(value))
                s += Character.toLowerCase(value);
            else
                s += Character.toUpperCase(value);

        return s;
    }
}
