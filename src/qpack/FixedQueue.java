package qpack;

public class FixedQueue implements ICharQ {
    private char[] q; //Storage array for symbols
    private int putloc, getloc;//indexes of insertion and extraction symbols

    //Empty queue of necessary size creation
    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //Symbol insertion
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full");
            return;
        }

        q[putloc++] = ch;

    }

    //Symbol extraction
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}
