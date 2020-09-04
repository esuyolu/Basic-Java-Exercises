package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = Integer.parseInt(kb.nextLine());

        DiamondShape.printDiamondShape(n);
    }
}
