package chapter14.static_method_links;

public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum::isFactor;

        result = ip.test(3);
        if (result) {
            System.out.println("3 is the divisor of the value " + myNum.getNum());
        }

        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result) {
            System.out.println("3 is not the divisor of the value " + myNum2.getNum());
        }
    }
}
