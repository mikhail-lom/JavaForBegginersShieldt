package test_space;

public class Test {
    public static void main (String args[]) {
//        System.out.println("Hello world!");
//        Test2.methodPrinter();
//        //Test2.forTestMethod();
//        Test2.arrayValueGenerator();

        TestInterface tI = () -> 98.6;
        System.out.println(tI.getTestInterface());

        MyParamValue myPval = (n) -> {
            double result;
            result = 2.0 / n;
            return result;
        };
        System.out.println("Value counter to 4 is equal: " + myPval.getValue(4.0));





    }
}

