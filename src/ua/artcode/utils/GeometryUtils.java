package ua.artcode.utils;

/**
 * @author Serhii Bilobrov
 * @since 1.7
 */
public class GeometryUtils {

    public static double evalSquareOfTriangle(double a, double b, double c) {
        double hP = evaluatePerimeter(a, b, c) / 2;
        return Math.sqrt(hP * ((hP - a) * (hP - b) + (hP -c)));
    }

    public static boolean isValidTriangle(double a, double b,double c){
        if(a + b > c && a + c > b && b + c > a){
            return true;
        } else {
            return false;
        }
    }

    public static double evaluatePerimeter(double x, double y, double z){
        double per = x + y + z;
        return per;
    }
}
