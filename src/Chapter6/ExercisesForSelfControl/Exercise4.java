package Chapter6.ExercisesForSelfControl;

public class Exercise4 {
    public static void main(String[] args) {
        Test obj1 = new Test(8);
        Test obj2 = new Test(6);

        obj2.swap(obj1);
        obj1.printContent();
        obj2.printContent();


    }
}


class Test {
    int a;
    Test(int i) {
        a=i;
    }

    void swap(Test obj){
        int t;
        t=obj.a;
        obj.a = a;
        a = t;

    }

    void printContent() {
        System.out.println(a);
    }
}