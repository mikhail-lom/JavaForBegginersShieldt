package chapter13.queue_package;

/**
 * Exercise 13.1
 * <p>demonstrating general queue class.</p>
 */
public class GenQDemo {
    public static void main(String[] args) {
        //Create Integer queue
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Integer queue demonstrating");
        try {
            for (int i=0; i<5; i++) {
                System.out.println("Inserting " + i + " into queue q");
                q.put(i); //insert Integer value into queue
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i=0; i<5; i++) {
                System.out.print("Receiving next Integer value from queue q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

        //Create queue for Double values
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);

        Double dVal;

        System.out.println("Double queue demonstrating");
        try {
            for (int i=0; i<5; i++) {
                System.out.println("Inserting " + (double)i/2 +
                        " into queue q2");
                q2.put((double)i/2); //enter double value into queue q2
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try{
           for (int i=0; i<5; i++) {
               System.out.print("Receiving next Double value from queue q2: ");
               dVal = q2.get();
               System.out.println(dVal);
           }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
