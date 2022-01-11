package chapter6.exercises_for_self_control;

/**
 * Exercise 13 Chapter 6
 */
public class Exercise13 {
    public static void main(String[] args) {

        TestVarArgs ob = new TestVarArgs();
        ob.sum(1,89,9,65,4123,-20);

    }
}

class TestVarArgs{

//    String param4 = "String in param4", param5 = "String in param5";
//    boolean param6 = true, param7 = false;

//    TestVarArgs(int ... p) {
//        for(int i =0; i < p.length; i++) {
//          param[i] = p[i];
//        }
//    }

    void sum(int...p) {
        int summary = 0;
        for (int i=0; i < p.length; i++) {
            summary += p[i];
            System.out.print("v" + i + ": " + p[i] + " ");
            System.out.println("summary: " + summary);
        }
    }
}
