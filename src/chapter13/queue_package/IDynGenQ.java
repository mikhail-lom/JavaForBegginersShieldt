package chapter13.queue_package;

/**
 * Dynamic queue (generics variant)
 * @param <T>
 */
public class IDynGenQ<T> implements IgenQ<T>{
    private T q[];//Storage array

    private int putloc, getloc;// insert and retrieve indexes

    public IDynGenQ(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    @Override
    public void put(T obj) {
        if (putloc == q.length) {
            //Increase size of the queue
            Object t[] = new Object[q.length*2];
            System.out.println(t.length);

            //Copying elements to new array
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            //replace previous array to new
            q = (T[]) t;
        }

            q[putloc++] = obj;


    }

    @Override
    public T get() throws QueueEmptyException {
        if (getloc==putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}
