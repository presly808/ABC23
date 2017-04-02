package ua.artcode.week1;

import ua.artcode.utils.GeometryUtils;
/**
 * @author Serhii Bilobrov
 * @since 1.7
 */
public class _1TriangleTask {

    public static void main(String[] args) {

        double a = 7;
        double b = 10;
        double c = 6;

        // %d = byte, short, int, long
        // %f = float, double
        // %s = String
        System.out.printf("a = %.2f, b = %.2f, c = %.2f\n", a, b, c);
        //System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // a + b > c && a + c > b && b + c > a
        if (GeometryUtils.isValidTriangle(a, b, c)) {

            double squareOfTriangle = GeometryUtils.evalSquareOfTriangle(a, b, c);

            System.out.printf("Square of the triangle is %.2f", squareOfTriangle);

        } else {
            System.out.println("Triangle's sides are invalid");
        }

    }



}


