package Chapter3.ExercisesForSelfControl;

/**
 * Exercise 4 from chapter 3
 */
public class Exercise4 {
    public static void main(String[] args) {
       for(int i = 1000; i >= 0; i--) {
           if(i%2 == 1) i--;
           System.out.print(i + " ");
       }
    }
}
