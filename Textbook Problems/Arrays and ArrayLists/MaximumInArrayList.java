// Challenge Problem 6.17.11

import java.util.ArrayList;

public class MaximumInArrayList {
    /**
     Computes the maximum value of a nonempty array list.
    @param values a non-empty array list
    @return the largest value in the array list
    */
    public static double maximum(ArrayList<Double> values)
    {
        // Compute the largest value, using an enhanced for loop
        double max = values.get(0);

        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}
