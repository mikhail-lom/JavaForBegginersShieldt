package chapter12;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Quadratic {

    public static void main(String[] args) {
        //a,b,c coefficients of
        //quadratic equation ax^2 + bx + c = 0
       double a, b, c, x, d;

        //Solve quadratic equation 4x^2 + x - 3 = 0
        a = 4;
        b = 1;
        c = -3;

        //Discriminant finding
        d = sqrt(pow(b, 2) - 4 * a * c);

        //Find first root
        x = (-b + d) / (2 * a);
        System.out.println("First root is: " + x);


        //Find second root
        x = (-b - d) / (2 * a);
        System.out.println("Second root is: " + x);

    }
}
