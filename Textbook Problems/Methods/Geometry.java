// Challenge Problem 4.3.1

import java.util.Scanner;

public class Geometry
{
    /**
         Computes the area of a triangle
        @param x1 the x-coordinate of the first corner
        @param y1 the y-coordinate of the first corner
        @param x2 the x-coordinate of the second corner
        @param y2 the y-coordinate of the second corner
        @param x3 the x-coordinate of the third corner
        @param y3 the y-coordinate of the third corner
        @return the area of the triangle
    */
    public static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        // Area = 0.5*abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))
        double area = 0.5*Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        System.out.println(triangleArea(x1, y1, x2, y2, x3, y3));
        in.close();
    }
}
  