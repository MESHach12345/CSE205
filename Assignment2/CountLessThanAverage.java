import java.util.Scanner;

public class CountLessThanAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements in the Array: ");
        int numOfElements = scan.nextInt();

        int[] array = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter element: ");
            array[i] = scan.nextInt();
        }

        int numOfCounts = countLessThanAverage(array);

        System.out.println(numOfCounts);

        scan.close();
    }

    public static int countLessThanAverage(int[] myArray) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        int avg = sum / myArray.length;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < avg) {
                count++;
            }
        }

        return count;
    }
}