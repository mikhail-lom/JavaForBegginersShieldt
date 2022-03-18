package chapter12;

//Simple study program demonstrating of autoboxing and auto-unboxing features
public class AutoBox3 {
    public static void main(String[] args) {
    Integer iOb, iOb2;
    int i;

    iOb = 99;
        System.out.println("Initial value iOb: " + iOb);

    ++iOb;
        System.out.println("After ++iOb: " + iOb);

    iOb += 10;
        System.out.println("After iOb += 10: " + iOb);

    iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after counting expression: " + iOb2);

    i = iOb + (iOb / 3);
        System.out.println("i after counting expression: " + i);


    }

}
