public class MathUtil {
    public static void threeDigitCanonicalNumbers()
    {
        System.out.println("the numbers suitable for the condition");
        System.out.println("**************************************");

        for (int i = 100; i <= 999; ++i) {
            int a, b, c, cba, ab, ba, bc, cb;
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            cba = c * 100 + b * 10 + a;
            ab = 10 * a + b;
            ba = 10 * b + a;
            bc = 10 * b + c;
            cb = 10 * c + b;

            if (cba > i && NumberUtil.isPrime(i) && NumberUtil.isPrime(cba) && NumberUtil.isPrime(ab) && NumberUtil.isPrime(bc) && NumberUtil.isPrime(cb) && NumberUtil.isPrime(ba))
                System.out.println(i);
        }
    }
}
