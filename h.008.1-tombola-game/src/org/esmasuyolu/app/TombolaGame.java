package org.esmasuyolu.app;

import java.util.Random;

public class TombolaGame {

    public boolean game()
    {
        int firstStamp = draw();
        int secondStamp = draw();
        int thirdStamp = draw();

        for (;;) {
            if (firstStamp != secondStamp && secondStamp != thirdStamp && firstStamp != thirdStamp) {

                NumberUtil n = new NumberUtil();

                int sum = firstStamp + secondStamp + thirdStamp;
                int max = n.max(firstStamp, secondStamp, thirdStamp);
                int min = n.min(firstStamp, secondStamp, thirdStamp);
                int mid =  n.mid(firstStamp, secondStamp, thirdStamp);

                if (sum < 150)
                    return true;
                else if (n.isPrime(sum))
                    return true;
                else if (max - min > mid)
                    return true;
                else
                    return false;
            }

            else {
                while (firstStamp == secondStamp)
                    secondStamp = draw();
                while (secondStamp == thirdStamp)
                    thirdStamp = draw();
                while (firstStamp == thirdStamp)
                    firstStamp = draw();
            }
        }
    }

    public int draw()
    {
        Random r = new Random();

        return r.nextInt(99) + 1;
    }
}
