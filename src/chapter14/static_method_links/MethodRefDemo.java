package chapter14.static_method_links;

public class MethodRefDemo {
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        result = numTest(MyIntPredicates::isPrime, 17);
        if (result) {
            System.out.println("17 is a prime number");
        }

        result = numTest(MyIntPredicates::isEven, 12);
        if (result) {
            System.out.println("12 is even number");
        }

        result = numTest(MyIntPredicates::isPositive, 11);
        if (result) {
            System.out.println("11 is positive number");
        }

    }
}
