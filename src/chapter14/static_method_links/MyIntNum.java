package chapter14.static_method_links;

public class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v=x;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
