package java_oops.PackageA;
//import static  java.lang.Math.sqrt;
import static  java.lang.Math.*;

class Quadretic {
    public static void main(String[] args) {
        double a = 1 ,b = 2 ,c = -3 ,x;

        x=(-b + sqrt(pow(b,2) - 4*a*c))/(2*a);
        System.out.println("First solution is: " + x);
        x=(-b - sqrt(pow(b,2) - 4*a*c))/(2*a);
        System.out.println("2nd solution is: " + x);
    }
}
