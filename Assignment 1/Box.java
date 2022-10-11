// Below this comment: import the Scanner
import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scan = new Scanner(System.in);

        // Below this comment: declare any other variables you may need
        int height;
        int width;
        char border;
        char interior;

        // Below this comment: collect the required inputs
        System.out.println("Enter Height: ");
        height = scan.nextInt();

        System.out.println("Enter Width: ");
        width = scan.nextInt();

        System.out.println("Enter Border Design: ");
        border = scan.next().charAt(0);

        System.out.println("Enter Interior Design: ");
        interior = scan.next().charAt(0);

        // Below this comment: display the required results
        for(int i = 0; i < width; i++) {
            System.out.print(border);
        }
        
        System.out.print("\n");

        for(int i = 0; i < height - 2; i++) {
            System.out.print(border);
            for (int j = 0; j < width - 2; j++) {
                System.out.print(interior);
            }
            System.out.print(border);
            System.out.print('\n');
        }

        for(int i = 0; i < width; i++) {
            System.out.print(border);
        }

        scan.close();
    }
}
