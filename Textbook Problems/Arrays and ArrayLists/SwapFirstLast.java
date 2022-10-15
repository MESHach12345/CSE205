// Challenge Problem 6.4.4

public class SwapFirstLast {
    public static void swapFirstLast(int[] values)
    {
        int firstElement = values[0];
        int lastElement = values[values.length - 1];
        int temp = firstElement;
        firstElement = lastElement;
        lastElement = temp;

        values[0] = firstElement;
        values[values.length - 1] = lastElement;
    }
}
