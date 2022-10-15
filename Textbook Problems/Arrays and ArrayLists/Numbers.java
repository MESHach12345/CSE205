// Challenge Program 6.3.1 Function Program

public class Numbers
{
    public static int multiply(int[] factors)
    {
        int product = 1;

        for (int i = 0; i<factors.length; i++)
        {
            product *= factors[i];
        }
            
        return product;
    }
}