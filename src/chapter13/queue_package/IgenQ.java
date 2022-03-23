package chapter13.queue_package;
/**General interface of queue
 *
 * @param <T>
 */
public interface IgenQ<T> {
    //Insert element into queue
    void put(T ch) throws QueueFullException;

    //Retrieve element from queue
    T get() throws QueueEmptyException;
}

