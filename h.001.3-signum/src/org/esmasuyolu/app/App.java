package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("enter the number");
        int number = Integer.parseInt(kb.nextLine());

        System.out.printf("%d > 0 -> 1%n", number);
        System.out.printf("%d < 0 -> -1%n", number);
        System.out.printf("%d = 0 -> 0%n", number);
        System.out.println("---------------------");
        System.out.println(Sorting.signum(number));
    }

}
