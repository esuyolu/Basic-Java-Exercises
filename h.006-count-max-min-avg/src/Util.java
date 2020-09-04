import java.util.Scanner;

public class Util {
    public static void sample()
    {
        Scanner kb = new Scanner(System.in);

        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        double average = 0;

        for (;;) {
            System.out.println("do you want to enter a new value? [Enter 1 for Yes, 0 for No]");
            int val = Integer.parseInt(kb.nextLine());

            if (val == 0)
                break;
            else if (val == 1)
            {
                System.out.println("please enter a value in the range [0-100].");
                int number = Integer.parseInt(kb.nextLine());

                while (number < 0 || number > 100) {
                    System.out.println("please enter a value in the range [0-100].");
                    number = Integer.parseInt(kb.nextLine());
                }

                ++count;
                min = MathUtil.min(min, number);
                max = MathUtil.max(max, number);
                sum += number;
                average = (double) sum / count;
            }
            else
                System.out.println("please enter 1 or 0");
        }

        if (count == 0) {
            max = 0;
            min = 0;
        }

        System.out.println("----------RESULT----------");
        System.out.printf("count of numbers: %d%n", count);
        System.out.printf("maximum of numbers: %d%n", max);
        System.out.printf("minimum of numbers: %d%n", min);
        System.out.printf("average of numbers: %f", average);
    }
}
