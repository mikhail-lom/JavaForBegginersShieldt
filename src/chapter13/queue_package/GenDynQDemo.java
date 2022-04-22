package chapter13.queue_package;

/**
 * Exercise 13.1
 * <p>demonstrating general queue class.</p>
 */
public class GenDynQDemo {
    public static void main(String[] args) {
        //Create Integer queue
        Integer iStore[] = new Integer[3];
        IDynGenQ<Integer> q = new IDynGenQ<>(iStore);

        Integer iVal;

        System.out.println("Integer dynamic queue demonstrating");

            for (int i=0; i<15; i++) {
                System.out.println("Inserting " + i + " into queue q");
                q.put(i); //insert Integer value into queue
            }

        System.out.println();

        try {
            for (int i=0; i<20; i++) {
                System.out.print("Receiving next Integer value from queue q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

    }
}
