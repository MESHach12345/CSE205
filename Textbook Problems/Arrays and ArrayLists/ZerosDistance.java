// Challenge Activity 6.4.3

public class ZerosDistance {
    public static int zeroesDistance(double[] values)
    {
        int firstPos = 0;
        int lastPos = values.length - 1;
        boolean found = false;
        while (firstPos < values.length && !found)
        {
            if (values[firstPos] == 0) {
                found = true;
            } else {
                firstPos++;
            }
        }

        found = false;

        for (int i = values.length - 1; i> firstPos; i--) {
            if (values[i] == 0 && found == false) {
                lastPos = i;
                found = true;
            }
        }

        return (lastPos - firstPos);
    }
}
