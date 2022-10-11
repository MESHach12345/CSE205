import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of elements for the Array:");
        int numOfElements = scanner.nextInt();

        int[] mainArray = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter the element for the Array");
            int element = scanner.nextInt();
            mainArray[i] = element;
        }

        double[] finalArray = sumAndAvg(mainArray);

        System.out.println("{" + finalArray[0] + ", " + finalArray[1] + "}");

        scanner.close();
    }
    
    public static double[] sumAndAvg(int[] array) {
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        avg = sum/array.length;

        double[] finalArray = {sum, avg};

        return finalArray;
    }
}
