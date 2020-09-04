package org.esmasuyolu.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("width:");
        int width = Integer.parseInt(kb.nextLine());

        System.out.print("height:");
        int height = Integer.parseInt(kb.nextLine());

        BallShape.run(width, height);
    }
}
