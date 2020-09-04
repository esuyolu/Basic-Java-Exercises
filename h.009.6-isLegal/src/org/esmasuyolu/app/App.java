package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("enter a variable name: ");
        String s = kb.nextLine();

        System.out.println("------------------------------------------");

        System.out.printf(Util.isLegal(s) ? "%s is a valid variable name" : "%s is not a valid variable name", s);
    }
}
