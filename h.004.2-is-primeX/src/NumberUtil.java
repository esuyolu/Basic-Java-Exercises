public class NumberUtil {
    public static int digitsSum(int val)
    {
        int sum = 0;

        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }

        return Math.abs(sum);
    }

    public static int getDigitsCount(int val)
    {
        int count = 0;

        do {
            ++count;
            val /= 10;
        } while(val != 0);

        return count;
    }

    public static boolean isPrime(int val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        if (val % 11 == 0)
            return val == 11;

        for (int i = 13; i * i <= val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }
}
