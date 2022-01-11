package chapter3;

/**
 * Simple study program with the help functions
 */
class Help {
    public static void main(String[] args) throws java.io.IOException { // Exception to the users wrong actions

        char choice; // input variable

        System.out.println("Help:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("Choose: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice) {
            case '1' -> {
                System.out.println("if expression:\n");
                System.out.println("if(condition) instruction;");
                System.out.println("else instruction;");
            }
            case '2' -> {
                System.out.println("Switch expression:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case const:");
                System.out.println(" set of instructions");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("default:");
                System.out.println(" default case expression;");
                System.out.println("}");
            }
            default -> System.out.print("Request not found.");
        }


    }


}
