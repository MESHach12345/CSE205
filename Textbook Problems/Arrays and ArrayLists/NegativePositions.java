// Challenge Problems 6.17.7

import java.util.ArrayList;

public class NegativePositions {
    public static ArrayList<Integer> negativePositions(ArrayList<Double> values) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) < 0) {
                result.add(i);
            }
        }

        return result;
    }
}
