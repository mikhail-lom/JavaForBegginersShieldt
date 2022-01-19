package chapter9;

public class ExcDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        try {
            System.out.println("Before exeption generation");

            nums[7] = 10;
            System.out.println("This line won't show");
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        System.out.println("After catch instruction");
    }
}
