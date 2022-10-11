import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number of Elements for the Array: ");
        int numOfElements = scan.nextInt();

        int[] array = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter the element: ");
            array[i] = scan.nextInt();
        }

        int range = range(array);
        
        System.out.println(range);

        scan.close();
    }

    public static int range (int[] myArray) {
        int min = myArray[0];
        int max = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }

            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        int range = max - min;

        return range;
    }
}
