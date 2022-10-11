import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of Elements in the Array: ");
        int numOfElements = scanner.nextInt();

        int[] array = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter the element: ");
            array[i] = scanner.nextInt();
        }

        int[] finalArray = minAndMax(array);

        System.out.println("{" + finalArray[0] + "," + finalArray[1] + "}");
        scanner.close();
    }

    public static int[] minAndMax(int[] myArray) {
        int min = myArray[0];
        int max = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            for (int j = 1; j < myArray.length; j++){
                if (myArray[j] < min) {
                    min = myArray[j];
                } else if (myArray[j] > max) {
                    max = myArray[j];
                } else {
                    continue;
                }
            }
        }

        int[] result = {min, max};

        return result;
    }
}
