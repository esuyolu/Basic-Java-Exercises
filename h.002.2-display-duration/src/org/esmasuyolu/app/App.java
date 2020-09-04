package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("enter the seconds");
        long second = Integer.parseInt(kb.nextLine());

        DisplayTime.displayDuration(second);
    }
}
