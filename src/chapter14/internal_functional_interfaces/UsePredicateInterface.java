package chapter14.internal_functional_interfaces;

import java.util.function.Predicate;

public class UsePredicateInterface {
    public static void main(String[] args) {

        Predicate<Integer> isEven = (n)-> {
            return (n % 2) == 0;
        };
        if (isEven.test(4)) {
            System.out.println("4 is even value!");
        }
        if (!isEven.test(5)) {
            System.out.println("5 is uneven value!");
        }
    }
}

