package org.esmasuyolu.app;

public class App {
    public static void main(String[] args)
    {
        TombolaGame tombolaGame = new TombolaGame();
        int count = 0;

        for (int i = 0; i < 30000; ++i)
            if (tombolaGame.game())
                ++count;

        System.out.printf("the probability of winning the game: %f", (double)count / 30000);
    }
}
