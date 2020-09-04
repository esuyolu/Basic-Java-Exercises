import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = Integer.parseInt(kb.nextLine());

        if (MathUtil.isPrimeX(num))
            System.out.println("the number you enter is a number that matches the given rule");
        else
            System.out.println("the number you entered did not match the given rule");
    }
}
