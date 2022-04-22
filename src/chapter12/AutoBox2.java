package chapter12;

public class AutoBox2 {
    static void learningMethod(Integer v) {
        System.out.println("m got " + v);
    }

    //This method returns int value
    static int learningMethod2() {
        return 10;
    }

    //This method returns Integer value
    static Integer learningMethod3() {
        return 99; //Autoboxing 99 value into Integer object
    }

    public static void main(String[] args) {

        //Transit of learningMethod() to int type.
        //learningMethod() has parameter of Integer type,
        //thus int value autoboxing.
        learningMethod(199);

        //iOb object get int value, returnable by
        //learningMethod2(). This value autoboxing
        //for assignment to iOb object.
        Integer iOb = learningMethod2();
        System.out.println("Value, returnable from learningMethod2(): "
         + iOb);

        //Further learningMethod3() return Integer value, which
        // automatically unboxing and converting to int type.
        int i = learningMethod3();
        System.out.println("Value, returnable from learningMethod3() "
        + i);

        //Then Math.sqrt() method take as a parameter iOb object,
        //which automatically unboxing, and it's value raise to
        //double type, required for execution of this method
        iOb = 100;
        System.out.println("Square root from iOb is: " + Math.sqrt(iOb));

    }
}
