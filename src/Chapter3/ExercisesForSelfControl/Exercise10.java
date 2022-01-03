package Chapter3.ExercisesForSelfControl;

/**
 * Exercise 10 chapter 3
 * ASCII converter for letters
 */
public class Exercise10 {
    public static void main(String[] args) throws java.io.IOException {
        char userInputButton;
        int counterOfChangedSymbols = 0;
        System.out.println("Please, enter button(s)");
        System.out.println("For exit enter '.':");
        for (userInputButton = 1; userInputButton != '.';) { // Making loop infinite
            do {
                userInputButton = (char) System.in.read();
                if (userInputButton != '.') { // Checking for exit sign
                    if (userInputButton > 64 && userInputButton < 91) { // Checking for ASCII CAPITAL cases
                        userInputButton += 32;
                        counterOfChangedSymbols++;
                        System.out.print(userInputButton);
                    } else if (userInputButton > 96 && userInputButton < 123){ // Checking for ASCII lower cases
                        userInputButton -= 32;
                        counterOfChangedSymbols++;
                        System.out.print(userInputButton);
                    } else {
                        System.out.print(userInputButton);
                    }
                }
            } while (userInputButton == '\n');
        }
        System.out.println();
        System.out.println("ChangedSymbols: " + counterOfChangedSymbols); // Showing count of symbols had been changed
    }
}
