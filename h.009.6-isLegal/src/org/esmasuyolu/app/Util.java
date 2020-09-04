package org.esmasuyolu.app;

public class Util {
    public static boolean isLegal(String str)
    {
        str = str.trim();
        char ch = str.charAt(0);

        if (Character.isDigit(ch))
            return false;

        if (!Character.isLetter(ch))
            return ch == '$' || ch == '_';


        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);

            if (Character.isWhitespace(c))
                return false;
        }

        return true;
    }
}
