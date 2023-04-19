package first_maven_project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(root(69));
        System.out.println(Math.pow(69,1.0/2));
    }

    public static double root(int x){
        double L = 0;
        double R = x;
        while (R - L> Math.pow(10,-6)){
            double mid = (L + R) / 2;
            if (mid * mid < x){
                L = mid;
            }
            else {
                R = mid;
            }
        }
        return (L + R) / 2;
    }
}