public class MathUtil {
    public static boolean isPrimeX(int val)
    {
        for (;;) {
            if (NumberUtil.getDigitsCount(val) == 1 && NumberUtil.isPrime(val))
                break;

            if (NumberUtil.isPrime(val)) {
                System.out.printf("%d is prime%n", val);
                val = NumberUtil.digitsSum(val);
            }
            else {
                System.out.printf("%d is not prime%n", val);
                System.out.println("*****RESULT*****");
                return false;
            }
        }
        System.out.printf("%d is prime%n", val);
        System.out.println("*****RESULT*****");
        return true;
    }
}
