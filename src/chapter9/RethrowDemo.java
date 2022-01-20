package chapter9;

class Rethrow {
    public static void genException() {
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] denom = {2, 0, 4, 4, 0, 8};
        int j = 0;

        for (int i=0; i< numer.length; i++) {
            try {
                System.out.println(numer[i] + " / "
                        + denom[i] + " equals " +
                        numer[i] / denom[i]);
            }
            catch (ArithmeticException exc) {
                System.out.println("attempt to divide by zero");
                System.out.println(exc.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Element not found");
                j++;
                if (j > 1) {
                    throw exc;
                }
            }
        }
    }
}

public class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Critical error - " +
                    "program work abort");
            exc.printStackTrace();
        }

    }
}


