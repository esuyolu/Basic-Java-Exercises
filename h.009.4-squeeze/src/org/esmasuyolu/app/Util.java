package org.esmasuyolu.app;

public class Util {
    public static String squeeze(String s1, String s2)
    {
        int len = s2.length();

        for (int i = 0; i < len; ++i) {
            char c2 = s2.charAt(i);

            if (s1.contains(c2 + ""))
                s1 = s1.replace(c2, ' ');
        }

        String res = "";

        char [] chars = s1.toCharArray();

        for (char c : chars)
            if (!Character.isWhitespace(c))
                res += c;

        return res;
    }
}
