package Chapter3;

/**
 * Extended help system, where "do-while" loop uses for
 * menu items choice
 */
class Help2 {
    public static void main(String[] args) throws java.io.IOException { // Exception to the users wrong actions

        // user's input variable
        char choice, ignore;

        do {
            System.out.println("Help:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.print("Choose: ");

            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if expression:\n");
                System.out.println("if(condition) instruction;");
                System.out.println("else instruction;");
                break;
            case '2':
                System.out.println("Switch expression:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case const:");
                System.out.println(" set of instructions");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("default:");
                System.out.println(" default case expression;");
                System.out.println("}");
                break;
            case '3':
                System.out.println("For loop: \n");
                System.out.print("for(initialisation; condition; iteration)");
                System.out.println("instruction;");
                break;
            case '4':
                System.out.println("While loop: \n");
                System.out.println("while(condition) instruction");
                break;
            case '5':
                System.out.println("do-while loop: \n");
                System.out.println("do {");
                System.out.println(" instruction;");
                System.out.println("} while (condition);");
                break;


        }


    }


}
