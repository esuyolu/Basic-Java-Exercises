package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("enter the 1st number: ");
        int a = Integer.parseInt(kb.nextLine());

        System.out.print("enter the 2nd number: ");
        int b = Integer.parseInt(kb.nextLine());

        System.out.print("enter the 3rd number: ");
        int c = Integer.parseInt(kb.nextLine());

        Sorting.sortThreeNumbers(a, b, c);
    }
}
