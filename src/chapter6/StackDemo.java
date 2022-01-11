package chapter6;
/**
 * Queue class creation
 */
class StackDemo {
    public static void main(String[] args) {
      Stack bigS = new Stack(100);
      Stack smallS = new Stack(4);
      char ch;
      int i;

        System.out.println("bigS stack usage " +
                "for alphabet storage");
        //insertion of letter symbols into stack
        for (i=0; i < 26; i++)
            bigS.push((char) ('A' + i));
        //extraction and displaying of symbols from bigS stack
        System.out.print("bigS stack content: ");
        for (i=0;i < 26; i++) {
            ch = bigS.pop();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("smallS usage for error generating");
        //smallS usage for error generating
        for(i=0; i < 5; i++) {
            System.out.print("Trying to save " + (char)('Z' - i));

            smallS.push((char) ('Z' - i));

            System.out.println();
        }
        System.out.println("smallS content: ");
        for (i=0; i < 5; i++) {
            ch = smallS.pop();

            if(ch != (char) 0) System.out.print(ch);
        }

    }
}

class Stack {
    private char[] stck;//Queue items storage
    private int tos;//insertion and extraction indices

    //Creation of empty stack of defined size
    Stack(int size) {
        stck = new char[size];//Memory allocation
        tos=0;
    }

    //Create stack from another one
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
    }

    //Create stack with initial values
    Stack(char[] a){
        stck = new char[a.length];

        for(int i=0; i < a.length; i++) {
            push(a[i]);
        }
    }
    /* Insertion of element to the stack */
    void push(char ch){
        if (tos == stck.length) {
            System.out.println(" - Queue is full");
            return;
        }
        stck[tos++] = ch;
    }

    /*Extraction of element from the stack*/
    char pop() {
        if(tos == 0) {
            System.out.println(" - Stack is empty");
            return (char) 0;
        }
        return stck[tos++];
    }

}
