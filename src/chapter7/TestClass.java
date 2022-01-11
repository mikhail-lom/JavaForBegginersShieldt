package chapter7;

/**
 * Test class for simulation code from Herbert Shieldt book
 */
public class TestClass {


    public static void main(String[] args) {
        System.out.println();
        TestClass tc = new TestClass();
        TestClass tc1 = new TestClass();
        System.out.println(tc.hashCode());
        System.out.println(tc1.hashCode());
        System.out.println(tc.toString());
        System.out.println(tc1.equals(tc));
    }
}

