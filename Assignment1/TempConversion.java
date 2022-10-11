import java.util.Scanner;

public class TempConversion { 
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scan = new Scanner(System.in);

            
        // Below this comment: declare any other variables you may need
        // to store the user's input and the Kelvin equivalent value

        float fahrenheit;
        float kelvin;


        // Below this comment: collect the requried inputs from the user
        System.out.print("Enter temperature in Fahrenheit : ");
        fahrenheit = scan.nextFloat();


        // Below this comment: call your FahrenheitToKelvin method
        kelvin = FahrenheitToKelvin(fahrenheit);


        // Below this comment: disply the required results
        System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Kelvin\n", fahrenheit, kelvin);        
        scan.close();
    }

    // define your FahrenheitToKelvin method here below
    public static float FahrenheitToKelvin(float temp){
        float kelvinTemp = ((temp-32)*5/9)+(float)273.15;
        
        return kelvinTemp;
    }
}