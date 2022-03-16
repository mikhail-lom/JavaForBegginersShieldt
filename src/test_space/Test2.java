package test_space;

import java.util.Random;

public class Test2 {
    static int a = 3, b = 5;
    static double x = 13.5, y = 78.258;
    static boolean flag1 = true, flag2 = false;
    static char letter1 = 'A', letter2 = 'a';
    static String phrase1 = "Hi", phrase2 = "f*cking world";
    static int doubleDimensionArray[][] = new int[a][b];

    public static void ifPrinter() {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    static void methodPrinter() {
        String result = switchCase();
        System.out.println(result);
    }

    static String switchCase() {
        String result;
        switch (phrase1) {
            case "Hello":
                result = "H";
                break;
            case "Hi":
                result = "h";
                break;
            default:
                result = "Default case";
        }
        return result;
    }

    static double testSumMethod (double member1, double member2) {
        double sum;
        sum = member1 + member2;
        return sum;
    }

    static void forTestMethod(){
        for(int i = 0; i < 10; i++) {
            x *= 2;
            y /= 3;
            System.out.printf("'%5.2f'", x);
            System.out.printf("'%5.4f'",y);
            System.out.println();
        }
    }

    static void arrayValueGenerator() {
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                Random randomArrayValue = new Random();
                doubleDimensionArray[i][j] = randomArrayValue.nextInt(500);
                System.out.print(doubleDimensionArray[i][j] + " ");
            }
            System.out.println();
        }
    }




}
