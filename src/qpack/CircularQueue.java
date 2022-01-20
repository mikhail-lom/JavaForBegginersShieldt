package qpack;

/**
 * Incorrect Circular queue class!
 * Need detail repair (error in studbook)
 */
public class CircularQueue implements ICharQ {
    private char[] q;//Storage array for symbols
    private int putloc, getloc;//indexes of insertion and extraction symbols

    //Empty queue of necessary size creation
    public CircularQueue(int size) {
        q = new char[size + 1];//Memory selecting for the queue
        putloc = getloc = 0;
    }

    //Symbol insertion
    public void put(char ch) {
        //Queue is full, if putloc is less on 1 than
        //getloc, or if putloc indicates to the end of array, and getloc
        //to the start of array
        if (putloc + 1 == getloc |
                ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Queue is full");
            return;
        }

        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0;//go to start of array
    }

    //Symbol extraction
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0;//return to
        // the start of array
        return q[getloc];
    }
}
