package chapter14.exercises;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;


public class TestDemo {
    public static void main(String[] args) {
        MyTest mt = (n) -> (n>9&&n<21) ;

        System.out.println(mt.testing(20));

        BinaryOperator<Integer> pI = (t, u) -> {
            for (int i=1; i<t; i++) {
                u = 1;
                u *=i;
            }
            return (u);
        };

        System.out.println(pI.apply(5,0));
    }
}
