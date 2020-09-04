package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("enter a text: ");
        String s = kb.nextLine();

        System.out.println("*************************************");

        System.out.printf("-%s-%n", s);
        System.out.printf("-%s-%n", Util.practice(s));
    }
}
