package chapter13.queue_package;
/**General class, that realises fixed size queue
 *
 * @param <T>
 */
public class GenQueue<T> implements IgenQ<T>{
    private T q[]; //Array to storage elements

    private int putloc, getloc; // insert and retrieve indexes

    //Empty queue from array creation
    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    //Insert element into queue
    @Override
    public void put(T obj) throws QueueFullException {
        if(putloc==q.length) {
            throw new QueueFullException(q.length);
        }
        q[putloc++] = obj;

    }

    //Retrieve element from queue

    @Override
    public T get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}
