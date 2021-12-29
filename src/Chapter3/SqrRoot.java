package Chapter3;

/**
 * Simple program for showing sqrt's from 1 till 99
 */
public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("SQRT from " + num + " equals " + sroot);

            // value rounding error
            rerr = num - (sroot * sroot);
            System.out.println("Value rounding error: " + rerr);
            System.out.println();
        }

    }
}