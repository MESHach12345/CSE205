// Challenge Problem 6.7.3

public class ArrayUtils {
    public static int[] randomInts(int len, int n) {
        
        int[] finalArray = new int[len];
        
        for (int i = 0; i < len; i++) {
            finalArray[i] = (int) (Math.random() * n);
        }

        return finalArray;
    }
}
