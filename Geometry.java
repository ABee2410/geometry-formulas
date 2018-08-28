/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double base, double height) 
    {
        double area = base * height;
        return area;
    }
    /**
     * Calculates the area of a trapezoid.
     *
     * @param b1  length of base of trapezoid
     * @param b2  length of top base of trapezoid
     * @param h   height of the trapezoid
     * @return   area of the trapezoid
     */
    public static double trapezoidArea(double base1, double base2, double height)
    {
        double area = (base1 + base2) * 0.5 * height;
        return area;
    }
    /**
     * Calculates the volume of a rectangular prism.
     *
     * @param l  length of prism base
     * @param w  width of prism base
     * @param h  heigth/depth of the prism
     * @return   volume of the prism
     */
    public static double volumeRectangularPrism(double length, double height, double width)
    {
        double volume = length * height * width;
        return volume;
    }
    /**
     * Calculates the volume of a cone.
     *
     * @param r  radius of the base of the cone
     * @param h  height of the cone
     * @return   volume of the cone
     */
    public static double volumeCone(double radius, double height)
    {
        double volume = Math.PI * Math.pow(radius, 2) * height / 3;
        return volume;
    }
    /**
     * Calculates the surface area of a prism.
     *
     * @param l  length of prism base
     * @param w  width of prism base
     * @param h  heigth/depth of the prism
     * @return   surface area of the prism
     */
    public static double surfaceAreaPrism(double length, double width, double height)
    {
        double base = length * width;
        double perimeter = (2 * length) + (2 * width);
        double area = 2 * base + perimeter * height;
        return area;
    }
    /**
     * Calculates the volume of a rectangular prism.
     *
     * @param r  the radius of the sphere
     * @return   surface area of the sphere
     */
    public static double surfaceAreaSphere(double radius)
    {
        double surfaceArea = 4 * Math.PI * Math.pow(radius,2);
        return surfaceArea;
    }
    /**
     * Calculates the hypotenuse of a right triangle.
     *
     * @param a  length of the a side of the triangle
     * @param w  length of the b side of the triangle
     * @return   length of the c side (hypontenuse aka longest side across the 90 degree angle) of the triangle
     */
    public static double hypotenuse(double a, double b)
    {
        double hyp = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return hyp;
    }
    /**
     * Calculates the distance between two coordinate points.
     *
     * @param x1  the x value of the first coordinate
     * @param y1  the y value of the first coordinate
     * @param x2  the x value of the second coordinate
     * @param y2  the y value of the second coordinate
     * @return    distance between the two coordinate points
     */    
    public static double pointDistance(double x1, double y1, double x2, double y2)
    {
        double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return dist;
    }
    /**
     * Calculates the slope between two points.
     *
     * @param x1  the x value of the first coordinate
     * @param y1  the y value of the first coordinate
     * @param x2  the x value of the second coordinate
     * @param y2  the y value of the second coordinate
     * @return    slope of the line between the two points
     */    
    public static double pointSlope(double x1, double y1, double x2, double y2)
    {
        double slope = (x2 - x1) / (y2 - y1);
        return slope;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    /**
     * Calculates the area of a triangle using Heron's formula.
     *
     * @param a  length of side a
     * @param b  length of side b
     * @param c  length of side c
     * @return   area of the triangle
     */    
    public static double triangleArea2(double a, double b,double c)
    {
        double S = (a + b + c) / 2;
        double area = Math.sqrt(S * (S-a) * (S-b) * (S-c));
        return area;
    }
    /**
     * Calculates the volume of a sphere.
     *
     * @param r  the radius of the sphere
     * @return   volume of the sphere
     */     
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    /**
     * For calling other geometry functions and to print calculations.
     */
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
    }
    
}
