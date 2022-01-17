package qpack;

public class DynQueue implements ICharQ {
    private char[] q;//Storage array for symbols
    private int putloc, getloc;//indexes of insertion and extraction symbols

    //Empty queue of necessary size creation
    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //Symbol insertion
    public void put(char ch) {
        if (putloc == q.length) {
            //Increase size of the queue
            char t[] = new char[q.length * 2];

            //Copying elements to new array
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }

        q[putloc++] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        return q[getloc++];
    }
}
