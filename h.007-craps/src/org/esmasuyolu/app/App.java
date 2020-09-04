package org.esmasuyolu.app;

public class App {
    public static void main(String[] args)
    {
        DiceSimulation ds = new DiceSimulation();
        int count = 0;

        for (int i = 0; i < 100000; ++i)
            if (ds.conditions())
                ++count;

        System.out.printf("the probability of winning the game: %f", (double)count / 100000);
    }
}
