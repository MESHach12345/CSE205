// Challenge Program 6.9.3

import java.util.Scanner;
import java.util.Arrays;

public class FindPositiveAndNegative {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = in.nextInt();
        }
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg++;
            } else if (nums[i] > 0) {
                pos++;
            } else {
                continue;
            }
        }

        System.out.printf("%s has %d positive and %d negative.%n",
        Arrays.toString(nums), pos, neg);

        in.close();
    }
}
