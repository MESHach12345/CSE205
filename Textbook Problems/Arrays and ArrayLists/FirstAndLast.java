// Challenge Activity 6.1.1

import java.util.Scanner;

public class FirstAndLast
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int LENGTH = 100;
        double[] prices = new double[LENGTH];

        System.out.println("Enter prices, Q to finish:");
        int numberOfPrices = 0;
        while (in.hasNextDouble())
        {
            double price = in.nextDouble();

            if (numberOfPrices < LENGTH)
            {
                prices[numberOfPrices] = price;
                numberOfPrices++;
            }
        }

        double sum = prices[0] + prices[numberOfPrices-1];

        System.out.printf("Sum of first and last: %.2f%n", sum);

        in.close();
    }
}
