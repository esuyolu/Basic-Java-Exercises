package org.esmasuyolu.app;

public class Util {
    public static String innerMostWriting(String str)
    {
        int count1 = 0;
        int count2 = 0;
        int index1 = 0;
        int index2 = 0;
        int len = str.length();

        for (int i = 0; i < len; ++i)
            if (str.charAt(i) == '{') {
                ++count1;
                index1 = i;
            }

        for (int i = len - 1; i >= 0; --i)
            if (str.charAt(i) == '}') {
                ++count2;
                index2 = i;
            }

        if (count1 != count2)
            return "wrong writing entry";

        return str.substring(index1 + 1, index2);
    }
}
