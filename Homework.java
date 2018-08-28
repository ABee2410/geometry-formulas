/**
 * Just a demo of how you can access functions in one class from another.
 * 
 * @author Jon Cooper 
 * @version August 23, 2018
 */
public class Homework
{
    public static void main(String[] args)
    {
        double a = Geometry.parallelogramArea(5, 4); 
        double b = Geometry.surfaceAreaSphere(2);
        System.out.println(a);
        System.out.println(b);
    }
}
