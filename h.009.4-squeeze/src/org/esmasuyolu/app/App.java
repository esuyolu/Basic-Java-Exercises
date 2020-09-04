package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("first writing: ");
        String s1 = kb.nextLine();

        System.out.print("second writing: ");
        String s2 = kb.nextLine();

        System.out.println("**********RESULT**********");

        System.out.println(Util.squeeze(s1, s2));
    }
}
