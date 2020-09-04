package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = Integer.parseInt(kb.nextLine());

        int result = MathUtil.sumFactors(num);

        System.out.printf("The sum of all the multipliers, excluding the number %d itself : %d%n", num, result);
    }
}
