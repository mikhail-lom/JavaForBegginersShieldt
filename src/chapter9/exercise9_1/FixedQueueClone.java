package chapter9.exercise9_1;



public class FixedQueueClone implements ICharQClone {
    private char[] q; //Storage array for symbols
    private int putloc, getloc;//indexes of insertion and extraction symbols

    //Empty queue of necessary size creation
    public FixedQueueClone(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //Symbol insertion
    public void put(char ch) throws QueueFullException{
        if (putloc == q.length) {
            throw new QueueFullException(q.length);
        }

        q[putloc++] = ch;

    }

    //Symbol extraction
    public char get() throws QueueEmptyException{
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}
