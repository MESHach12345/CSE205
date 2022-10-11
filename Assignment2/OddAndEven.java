import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements for the Array: ");
        int numOfElements = scan.nextInt();

        int[] array = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter the element: ");
            int element = scan.nextInt();
            array[i] = element;
        }

        int[] finalArray = oddAndEven(array);

        System.out.println("{" + finalArray[0] + "," + finalArray[1] + "}");

        scan.close();
    }

    public static int[] oddAndEven(int[] myArray) {
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]%2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] result = {oddCount, evenCount};

        return result;
    }
}
