package org.esmasuyolu.app;

import java.util.Random;

public class DiceSimulation {
    public boolean conditions()
    {
        int res = playDice();

        for (;;) {
            if (res == 7 || res == 11)
                return true;
           else if (res == 2 || res == 3 || res == 12)
                return false;
           else {
               int secRes = playDice();

               if (secRes == 7)
                   return false;
               else if (secRes == res)
                   return true;
            }
        }
    }

    public int playDice()
    {
        Random r1 = new Random();
        Random r2 = new Random();

        int dice1 = r1.nextInt(6) + 1;
        int dice2 = r2.nextInt(6) + 1;

        return dice1 + dice2;
    }
}
