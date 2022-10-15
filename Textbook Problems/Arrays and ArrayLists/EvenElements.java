// Challenge Program 6.17.6

public class EvenElements {
    public static int evenElements(double[][] values) {
        int rows = values.length;
        int cols = values[0].length;
        int evenNums = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (values[i][j] % 2 == 0) {
                    evenNums += 1;
                }
            }
        }

        return evenNums;
    }
}
