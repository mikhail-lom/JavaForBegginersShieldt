package chapter5;
/**
 * Queue class creation
 */
public class QDemo {
    public static void main(String[] args) {
      Queue bigQ = new Queue(100);
      Queue smallQ = new Queue(4);
      char ch;
      int i;

        System.out.println("bigQ queue usage " +
                "for alphabet storage");
        //insertion of letter symbols into queue
        for (i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        //extraction and displaying of symbols from bigQ queue
        System.out.print("bigQ queue content: ");
        for (i=0;i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("smallQ usage for error generating");
        //smallQ usage for error generating
        for(i=0; i < 5; i++) {
            System.out.print("Trying to save " + (char)('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println("smallQ content: ");
        for (i=0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }

    }
}

class Queue {
    char[] q;//Queue items storage
    int putloc, getloc;//insertion and extraction indices

    Queue(int size) {
        q = new char[size];//Memory allocation
        putloc=getloc=0;
    }
    /* Insertion of element to the queue */
    void put(char ch){
        if (putloc == q.length) {
            System.out.println(" - Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    /*Extraction of element from the queue*/
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }

}
