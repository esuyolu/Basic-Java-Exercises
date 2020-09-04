package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("enter an even number");
        int val = Integer.parseInt(kb.nextLine());
        System.out.println("---------------------");

        MathUtil.goldbach(val);
    }
}
