import java.util.Scanner;
import java.lang.String;

public class Converter {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scan = new Scanner(System.in);
        
        // Below this comment: declare any other variables you may need
        // to store the user's input and the Feet and Inches equivalent value
        float meters;
        String feetString;
        
        
        // Below this comment: collect the required inputs
        System.out.print("Enter distance in Meters : ");
        meters = scan.nextFloat();
        
        
        // Below this comment: call your MetersToFeetAndInches method
        feetString = MetersToFeetAndInches(meters);
        
        // Below this comment: disply the required results
        System.out.printf("%.2f meters in Feet and Inches is : %s", meters, feetString);

        scan.close();
    }

    // define your MetersToFeetAndInches method here below
    public static String MetersToFeetAndInches(float meters) {
        float inches = (float)39.37*meters;
        int feet = (int)inches/12;
        inches = (inches%12);
        
        String output = String.format("%d' %.2f\"", feet, inches);
        
        return output;
    }
}