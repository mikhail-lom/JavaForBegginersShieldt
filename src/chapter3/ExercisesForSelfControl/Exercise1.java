package chapter3.ExercisesForSelfControl;

/**
 * Exercise 1 from chapter 3
 */
public class Exercise1 {
    public static void main(String[] args) throws java.io.IOException {
        char userInputValue;
        int spaceCounter = 0;
        System.out.println("Enter any button (for stop press '.')");
        do {
            userInputValue = (char) System.in.read();
            if (userInputValue == ' ') spaceCounter++;
        } while (userInputValue != '.');
        System.out.println("Spaces: " + spaceCounter);

    }
}
