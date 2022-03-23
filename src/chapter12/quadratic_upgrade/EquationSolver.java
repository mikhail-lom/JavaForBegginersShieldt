package chapter12.quadratic_upgrade;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class EquationSolver {
    //a,b,c are coefficients of
    //quadratic equation ax^2 + bx + c = 0
    double coefficientA, coefficientB, coefficientC, firstX, secondX, discriminant;

    EquationSolver(double a, double b, double c) {
        coefficientA = a;
        coefficientB = b;
        coefficientC = c;
        findDiscriminant();
        findRoots();
    }

    //finding discriminant and checking it
    void findDiscriminant() {
        discriminant = pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
    }

    void findRoots() {
        if (discriminant < 0 ) {
            System.out.println("Equation has no real roots");
        } else if(discriminant == 0) {
            secondX = firstX = (-coefficientB ) / (2 * coefficientA);
            System.out.println("Equation has only one root! This is x = " + secondX);
        } else {
            firstX = (-coefficientB + sqrt(discriminant)) / (2 * coefficientA);
            secondX = (-coefficientB - sqrt(discriminant)) / (2 * coefficientA);
            System.out.println("Equation roots are: " + firstX + " and " + secondX);
        }
    }
}
