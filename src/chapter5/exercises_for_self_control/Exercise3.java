package chapter5.exercises_for_self_control;

public class Exercise3 {
    public static void main(String[] args) {
        double[] averageTen = {5, 52.3, 8.2, 9, 9.123, 69, 78, 41.5, 96, 63.2};

        double sum = 0;

        for (double x:
             averageTen) {
            sum += x;
        }
         sum = sum / (averageTen.length-1);

        System.out.println("Average is: " + sum);
    }
}
