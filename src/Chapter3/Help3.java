package Chapter3;

/**
 * The most extended help system, where infinite "for" loop and "do-while" loop use for
 * menu items choice. Q-button is for "quite"
 */
class Help3 {
    public static void main(String[] args) throws java.io.IOException { // Exception to the users wrong actions

        // user's input variable
        char choice, ignore;

        for (; ; ) {
            do {
                System.out.println("Help:");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. for");
                System.out.println(" 4. while");
                System.out.println(" 5. do-while");
                System.out.println(" 6. break");
                System.out.println(" 7. continue\n");
                System.out.print("Choose (q - exit): ");

                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

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
                case '6':
                    System.out.println("Break instruction:\n");
                    System.out.println("break; or break label;");
                    break;
                case '7':
                    System.out.println("Continue instruction:\n");
                    System.out.println("continue; or continue label;");
                    break;


            }
            System.out.println();
        }


    }


}
