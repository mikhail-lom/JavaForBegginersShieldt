package chapter12;

public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100;  //Autoboxing

        int i = iOb; //Auto-unboxing

        System.out.println(i + " " + iOb);
    }
}
